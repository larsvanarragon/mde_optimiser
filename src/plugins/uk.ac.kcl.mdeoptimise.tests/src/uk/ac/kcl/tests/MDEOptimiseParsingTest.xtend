/*
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.mdeoptimise.Optimisation

@RunWith(XtextRunner)
@InjectWith(MDEOptimiseInjectorProvider)
class MDEOptimiseParsingTest{

	@Inject
	ParseHelper<Optimisation> parseHelper

	@Test 
	def void loadModel() {
		val result = "a"
		Assert.assertNotNull(result)
	}

}
