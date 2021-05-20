package br.unb.cic.obron.ide.ui.handler

import org.eclipse.core.commands.IHandler
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.MessageBox
import org.eclipse.swt.SWT
//import com.google.inject.Inject
//import org.eclipse.xtext.generator.IGenerator

class InterpreterHandler extends AbstractHandler implements IHandler {
	
	
//	@Inject
//    IGenerator generator;
//	
	override execute(ExecutionEvent event) throws ExecutionException {
		val Shell shell = Display.getDefault().getActiveShell();
		val MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION);
    
        dialog.setText("My info");
        dialog.setMessage("Do you really want to do this?");
        dialog.open();
	}
	
	override boolean isEnabled() {
        return true;
    }
	
}