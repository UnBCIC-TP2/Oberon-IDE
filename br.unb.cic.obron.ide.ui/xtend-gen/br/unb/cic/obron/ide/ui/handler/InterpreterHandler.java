package br.unb.cic.obron.ide.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

@SuppressWarnings("all")
public class InterpreterHandler extends AbstractHandler implements IHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    int _xblockexpression = (int) 0;
    {
      final Shell shell = Display.getDefault().getActiveShell();
      final MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION);
      dialog.setText("My info");
      dialog.setMessage("Do you really want to do this?");
      _xblockexpression = dialog.open();
    }
    return Integer.valueOf(_xblockexpression);
  }
  
  @Override
  public boolean isEnabled() {
    return true;
  }
}
