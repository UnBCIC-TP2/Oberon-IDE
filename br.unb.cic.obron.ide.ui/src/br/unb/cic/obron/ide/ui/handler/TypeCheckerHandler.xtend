package br.unb.cic.obron.ide.ui.handler

import java.nio.file.Files
import scala.collection.immutable.List
import scala.Tuple2
import br.unb.cic.oberon.ast.Statement
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
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.core.resources.IFile

/**
 * Executes Type Checker as Menu Option.   
 */
	 
class TypeCheckerHandler extends AbstractHandler implements IHandler {
	
	override Object execute(ExecutionEvent event) throws ExecutionException {

		/** getting the selected file  */
		var ISelection selection = HandlerUtil.getCurrentSelection(event);
        
        if (selection instanceof IStructuredSelection) {
        	
            var IStructuredSelection structuredSelection =  selection as IStructuredSelection;
            var Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
                var IFile file = firstElement as IFile;
                var IPath location = file.location       
                var pathx = Paths.get(location.toString)
                var content = String.join("\n", Files.readAllLines(pathx))
                
                /**  executes TypeChecker from OberonGenerator */
                var OberonGenerator gen = new OberonGenerator()
                var List<Tuple2<Statement, String>> errors
                try{
                    errors = gen.typeChecker(content)
                }catch(Exception e){
                    val Shell shell = Display.getDefault().getActiveShell();
                    val MessageBox dialog = new MessageBox(shell, SWT.ICON_ERROR);
                    dialog.setText("ERROR"); 
                    dialog.setMessage("Something went wrong!");
                    dialog.open();
                }
                
                /**  prints TypeChecker result as a Dialog Message*/
                if (errors.size() == 0) {
                    val Shell shell = Display.getDefault().getActiveShell();
                    val MessageBox dialog = new MessageBox(shell, SWT.ICON_WORKING);     
                    dialog.setText("Type Checker");
                    dialog.setMessage("Ok");
                    dialog.open();
                } else {
                    val Shell shell = Display.getDefault().getActiveShell();
                    val MessageBox dialog = new MessageBox(shell, SWT.ICON_ERROR);     
                    dialog.setText("Type Checker");
                    dialog.setMessage("Type Error Detected!\n\n" + errors.toString);
                    dialog.open();
                }
                
                 
            }
        }
		
		return null
	}

	override boolean isEnabled() {
		return true
	}
}