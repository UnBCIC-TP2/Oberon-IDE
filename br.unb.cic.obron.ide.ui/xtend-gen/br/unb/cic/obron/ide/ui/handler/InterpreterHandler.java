package br.unb.cic.obron.ide.ui.handler;

import br.unb.cic.obron.ide.generator.OberonGenerator;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Executes Interpreter as Menu Option.
 */
@SuppressWarnings("all")
public class InterpreterHandler extends AbstractHandler implements IHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      ISelection selection = HandlerUtil.getCurrentSelection(event);
      if ((selection instanceof IStructuredSelection)) {
        IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
        Object firstElement = structuredSelection.getFirstElement();
        if ((firstElement instanceof IFile)) {
          IFile file = ((IFile) firstElement);
          IPath location = file.getLocation();
          Path pathx = Paths.get(location.toString());
          String content = String.join("\n", Files.readAllLines(pathx));
          OberonGenerator gen = new OberonGenerator();
          try {
            gen.interpreter(content);
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Shell shell = Display.getDefault().getActiveShell();
              final MessageBox dialog = new MessageBox(shell, SWT.ICON_ERROR);
              dialog.setText("ERROR");
              dialog.setMessage("Something went wrong!");
              dialog.open();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public boolean isEnabled() {
    return true;
  }
}
