/*
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.ui.quickfix

import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import uk.ac.kcl.validation.MDEOptimiseValidatorIssues
import org.eclipse.jdt.core.JavaCore
import uk.ac.kcl.ui.classpath.MDEOClassPathContainerInitializer
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jdt.core.IClasspathEntry
import java.util.LinkedList

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class MDEOptimiseQuickfixProvider extends DefaultQuickfixProvider {

	@Inject
	private IJavaProjectProvider projectProvider;
	
	@Fix(MDEOptimiseValidatorIssues.MDEO_LIB_NOT_ON_CLASSPATH)
	def putMDEOOnClasspath(Issue issue, IssueResolutionAcceptor acceptor) {
		
		acceptor.accept(issue, "Add MDEOptimiser libs to classpath", 
				"Click to automatically add the MDEOptimiser libs container to classpath.", "", new ISemanticModification() {
			
			override apply(EObject element, IModificationContext context) throws Exception {
				
				var mdeoContainerEntry = JavaCore.newContainerEntry(MDEOClassPathContainerInitializer.MDEO_LIBRARY_PATH);
				val resourceSet = element.eResource().getResourceSet();
				val javaProject = projectProvider.getJavaProject(resourceSet);
				val projectClasspath = javaProject.getRawClasspath();
				val newProjectClasspath = new LinkedList<IClasspathEntry>(projectClasspath);
				
				if(newProjectClasspath.filter[classpath | classpath.path.equals(MDEOClassPathContainerInitializer.MDEO_LIBRARY_PATH)].empty) {
					newProjectClasspath.add(mdeoContainerEntry);
					javaProject.setRawClasspath(newProjectClasspath, new NullProgressMonitor())
				}
				
			}
		});
	}
}