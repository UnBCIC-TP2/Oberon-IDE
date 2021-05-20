package br.unb.cic.obron.ide.tests

import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import org.junit.Test
import org.junit.Assert
import br.unb.cic.obron.ide.generator.OberonGenerator
import scala.collection.immutable.List
import scala.Tuple2
import br.unb.cic.oberon.ast.Statement

@RunWith(XtextRunner)
class OberonGeneratorTest {
	
	@Test
	def void checkSimpleModule() {
		val contents = '''
			MODULE SimpleModule;
			
			CONST
			  x = 200;
			
			END SimpleModule.
		'''
		
		val gen = new OberonGenerator
		val errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size == 0)
		
	}
	
	@Test
	def void checkModuleWithError() {
		val contents = '''
			MODULE SimpleModule;
			
			CONST
			  x = 200;
			  
			BEGIN
			  x := x + y 
			END
			
			END SimpleModule.
		'''
		
		val gen = new OberonGenerator
		val List<Tuple2<Statement, String>> errors = gen.typeChecker(contents)
		
		Assert.assertTrue(errors.size > 0)
		
	}
	
}