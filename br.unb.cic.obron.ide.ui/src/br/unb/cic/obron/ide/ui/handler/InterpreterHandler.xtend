package br.unb.cic.obron.ide.ui.handler

import java.nio.file.Files
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.commands.IHandler
import org.eclipse.core.runtime.IPath
import br.unb.cic.obron.ide.generator.OberonGenerator
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.MessageBox
import org.eclipse.swt.SWT
import java.nio.file.Paths
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.jface.viewers.IStructuredSelection

/**
 * Executes Interpreter as Menu Option.   
 */

class InterpreterHandler extends AbstractHandler implements IHandler {
		
	override execute(ExecutionEvent event) throws ExecutionException {
		
		/**  getting the selected file */
		var ISelection selection = HandlerUtil.getCurrentSelection(event);
        
        if (selection instanceof IStructuredSelection) {
        	
            var IStructuredSelection structuredSelection =  selection as IStructuredSelection;
            var Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
                var IFile file = firstElement as IFile;
                var IPath location = file.location       
                var pathx = Paths.get(location.toString)
                var content = String.join("\n", Files.readAllLines(pathx))
                
                /**  executes Interpreter from OberonGenerator and prints results on the terminal */
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
                
        	}	
		}
		
		return null
	}
	
	override boolean isEnabled() {
        return true;
    }
	
}