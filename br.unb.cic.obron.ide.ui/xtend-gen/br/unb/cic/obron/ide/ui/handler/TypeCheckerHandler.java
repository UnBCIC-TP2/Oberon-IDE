package br.unb.cic.obron.ide.ui.handler;

import br.unb.cic.oberon.ast.Statement;
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
import scala.Tuple2;
import scala.collection.immutable.List;

/**
 * Executes Type Checker as Menu Option.
 */
@SuppressWarnings("all")
public class TypeCheckerHandler extends AbstractHandler implements IHandler {
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
          List<Tuple2<Statement, String>> errors = null;
          try {
            errors = gen.typeChecker(content);
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
          int _size = errors.size();
          boolean _equals = (_size == 0);
          if (_equals) {
            final Shell shell = Display.getDefault().getActiveShell();
            final MessageBox dialog = new MessageBox(shell, SWT.ICON_WORKING);
            dialog.setText("Type Checker");
            dialog.setMessage("Ok");
            dialog.open();
          } else {
            final Shell shell_1 = Display.getDefault().getActiveShell();
            final MessageBox dialog_1 = new MessageBox(shell_1, SWT.ICON_ERROR);
            dialog_1.setText("Type Checker");
            String _string = errors.toString();
            String _plus = ("Type Error Detected!\n\n" + _string);
            dialog_1.setMessage(_plus);
            dialog_1.open();
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
