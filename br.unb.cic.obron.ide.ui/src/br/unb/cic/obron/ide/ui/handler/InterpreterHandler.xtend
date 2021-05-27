package br.unb.cic.obron.ide.ui.handler

import java.io.File
import java.nio.file.Files
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.commands.IHandler
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.part.FileEditorInput
import br.unb.cic.obron.ide.generator.OberonGenerator
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.MessageBox
import org.eclipse.swt.SWT
import java.nio.file.Paths

class InterpreterHandler extends AbstractHandler implements IHandler {
		
	override execute(ExecutionEvent event) throws ExecutionException {

		/**  getting the current file */
		var IWorkbench wb = PlatformUI.getWorkbench()
		var IWorkbenchWindow window = wb.getActiveWorkbenchWindow()
		var IWorkbenchPage page = window.getActivePage()
		var IEditorPart editor = page.getActiveEditor()
		var IEditorInput input = editor.getEditorInput()
		var IPath path = ((input as FileEditorInput)).getPath()
		var String name = path.toString()
		var File myfile = new File(name)
		var IPath location = Path.fromOSString(myfile.getAbsolutePath())
		var pathx = Paths.get(location.toString)
		var content = String.join("\n", Files.readAllLines(pathx))
		
		/**  executes Interpreter from OberonGenerator and print results */
		var OberonGenerator gen = new OberonGenerator()
		
		try{
			gen.interpreter(content)
		} catch (Exception e){
			val Shell shell = Display.getDefault().getActiveShell();
			val MessageBox dialog = new MessageBox(shell, SWT.ICON_ERROR); 
			dialog.setText("ERROR"); 
			dialog.setMessage("Something went wrong!");
	        dialog.open();
		}
		
		return null
	}
	
	override boolean isEnabled() {
        return true;
    }
	
}