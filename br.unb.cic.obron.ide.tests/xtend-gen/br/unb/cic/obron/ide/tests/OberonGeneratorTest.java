package br.unb.cic.obron.ide.tests;

import br.unb.cic.oberon.ast.Statement;
import br.unb.cic.obron.ide.generator.OberonGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import scala.Tuple2;
import scala.collection.immutable.List;

@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class OberonGeneratorTest {
  @Test
  public void checkSimpleModule() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MODULE SimpleModule;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("CONST");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("x = 200;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("END SimpleModule.");
    _builder.newLine();
    final String contents = _builder.toString();
    final OberonGenerator gen = new OberonGenerator();
    final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
    int _size = errors.size();
    boolean _equals = (_size == 0);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void checkModuleWithError() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MODULE SimpleModule;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("CONST");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("x = 200;");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("VAR ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("z : INTEGER;  ");
    _builder.newLine();
    _builder.append("BEGIN");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("z := x + y ");
    _builder.newLine();
    _builder.append("END");
    _builder.newLine();
    _builder.newLine();
    _builder.append("END SimpleModule.");
    _builder.newLine();
    final String contents = _builder.toString();
    final OberonGenerator gen = new OberonGenerator();
    final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
    int _size = errors.size();
    boolean _greaterThan = (_size > 0);
    Assert.assertTrue(_greaterThan);
  }
}
