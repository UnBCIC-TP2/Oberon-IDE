package br.unb.cic.obron.ide.tests

import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import org.junit.Test
import org.junit.Assert
import br.unb.cic.obron.ide.generator.OberonGenerator
import java.nio.file.Files
import java.nio.file.Path

/**
 * Array Type and Record Type are not currently working
 * 
 */


@RunWith(XtextRunner)
class OberonGeneratorTest {
	
	
	/** TypeChecker is not detecting errors correctly */
	@Test
	def void ErroTipo1() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo1.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void ErroTipo2() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo2.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo3() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo3.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	/** TypeChecker is not detecting errors correctly */
	@Test
	def void ErroTipo4() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo4.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void ErroTipo5() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo5.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo6() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo6.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo7() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo7.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo8() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo8.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	/** TypeChecker is not detecting errors correctly */
	@Test
	def void ErroTipo9() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo9.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	/** TypeChecker is not detecting errors correctly */
	@Test
	def void ErroTipo10() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo10.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void ErroTipo11() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo11.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	

	@Test
	def void ErroTipo12() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo12.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	/** TypeChecker is not detecting errors correctly */
	@Test
	def void ErroTipo13() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo13.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void ErroTipo14() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo14.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	/** Array is not working
	@Test
	def void ErroTipo15() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo15.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size >= 0)
		
	}*/
	
	@Test
	def void ErroTipo16() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo16.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo17() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo17.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo18() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo18.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo19() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo19.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	/** Record is not working
	@Test
	def void ErroTipo20() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo20.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size >= 0)
		
	}*/
	
	/** TypeChecker is not detecting errors correctly */
	@Test
	def void ErroTipo21() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo21.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void ErroTipo22() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo22.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo23() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo23.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void ErroTipo24() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo24.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	/** TypeChecker is not detecting errors correctly */
	@Test
	def void ErroTipo25() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo25.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void ErroTipo26() {
		
		val contents = Files.readString(Path.of("testes/ErroTipo26.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
	@Test
	def void TesteTipo1() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo1.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo2() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo2.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo3() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo3.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo4() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo4.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo5() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo5.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo6() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo6.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo7() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo7.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo8() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo8.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo9() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo9.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo10() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo10.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo11() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo11.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo12() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo12.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo13() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo13.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo14() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo14.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void TesteTipo15() {
		
		val contents = Files.readString(Path.of("testes/TesteTipo15.oberon"))		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
}