package br.unb.cic.obron.ide.ui.handler;

import br.unb.cic.obron.ide.generator.OberonGenerator;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class InterpreterHandler extends AbstractHandler implements IHandler {
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      IWorkbench wb = PlatformUI.getWorkbench();
      IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
      IWorkbenchPage page = window.getActivePage();
      IEditorPart editor = page.getActiveEditor();
      IEditorInput input = editor.getEditorInput();
      IPath path = ((FileEditorInput) input).getPath();
      String name = path.toString();
      File myfile = new File(name);
      IPath location = Path.fromOSString(myfile.getAbsolutePath());
      java.nio.file.Path pathx = Paths.get(location.toString());
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
