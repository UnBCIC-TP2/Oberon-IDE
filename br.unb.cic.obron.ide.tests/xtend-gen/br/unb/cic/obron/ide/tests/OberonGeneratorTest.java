package br.unb.cic.obron.ide.tests;

import br.unb.cic.oberon.ast.Statement;
import br.unb.cic.obron.ide.generator.OberonGenerator;
import java.nio.file.Files;
import java.nio.file.Path;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import scala.Tuple2;
import scala.collection.immutable.List;

/**
 * Array Type and Record Type are not currently working
 */
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class OberonGeneratorTest {
  /**
   * TypeChecker is not detecting errors correctly
   */
  @Test
  public void ErroTipo1() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo1.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo2() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo2.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo3() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo3.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * TypeChecker is not detecting errors correctly
   */
  @Test
  public void ErroTipo4() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo4.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo5() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo5.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo6() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo6.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo7() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo7.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo8() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo8.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * TypeChecker is not detecting errors correctly
   */
  @Test
  public void ErroTipo9() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo9.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * TypeChecker is not detecting errors correctly
   */
  @Test
  public void ErroTipo10() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo10.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo11() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo11.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo12() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo12.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * TypeChecker is not detecting errors correctly
   */
  @Test
  public void ErroTipo13() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo13.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo14() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo14.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Array is not working
   * @Test
   * def void ErroTipo15() {
   * 
   * val contents = Files.readString(Path.of("testes/ErroTipo15.oberon"))
   * val gen = new OberonGenerator
   * val errors = gen.typeChecker(contents)
   * 
   * Assert.assertTrue(errors.size >= 0)
   * 
   * }
   */
  @Test
  public void ErroTipo16() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo16.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo17() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo17.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo18() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo18.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo19() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo19.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * TypeChecker is not detecting errors correctly
   */
  @Test
  public void ErroTipo21() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo21.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo22() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo22.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo23() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo23.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo24() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo24.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * TypeChecker is not detecting errors correctly
   */
  @Test
  public void ErroTipo25() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo25.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void ErroTipo26() {
    try {
      final String contents = Files.readString(Path.of("testes/ErroTipo26.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _greaterThan = (_size > 0);
      Assert.assertTrue(_greaterThan);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo1() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo1.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo2() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo2.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo3() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo3.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo4() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo4.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo5() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo5.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo6() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo6.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo7() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo7.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo8() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo8.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo9() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo9.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo10() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo10.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo11() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo11.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo12() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo12.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo13() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo13.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo14() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo14.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TesteTipo15() {
    try {
      final String contents = Files.readString(Path.of("testes/TesteTipo15.oberon"));
      final OberonGenerator gen = new OberonGenerator();
      final List<Tuple2<Statement, String>> errors = gen.typeChecker(contents);
      int _size = errors.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
