/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.myDsl.HardwareModel
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.Property
import org.xtext.example.mydsl.myDsl.Request
import org.xtext.example.mydsl.myDsl.Resource
import org.xtext.example.mydsl.myDsl.ResourceType
import org.xtext.example.mydsl.services.MyDslGrammarAccess
import org.xtext.example.mydsl.myDsl.Solution

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		model.getHardwareModel.format.append[setNewLines(1,1,1)]
		model.getSoftwareModel.format.append[setNewLines(1,1,1)]
		for (Request request : model.getRequests()) {
			request.format.append[setNewLines(1,1,1)]
		}
		model.getObjective.format.append[setNewLines(1,1,1)]
		model.getSolution.format.append[setNewLines(1,1,1)]
	}

	def dispatch void format(HardwareModel hardwareModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Property property : hardwareModel.getProperties()) {
			property.format;
		}
		for (ResourceType resourceType : hardwareModel.getResourceTypes()) {
			resourceType.format;
		}
		for (Resource resource : hardwareModel.getResources()) {
			resource.format;
		}
	}
	
	def dispatch void format(Solution solution, extension IFormattableDocument document){
		
		solution.assignments.forEach[a | 
			a.format.append[setNewLines(1,1,1)
				
				a.componentMappings.forEach[cm | cm.append[setNewLines(1,1,1)]
				a.resourceMappings.forEach[rm | rm.append[setNewLines(1,1,1)]]
		]]]
		
	}
	
	// TODO: implement for ResourceType, Resource, CurrentResourceValue, SoftwareModel, Component, Implementation, ComponentRequirement, ResourceRequirement, Clause, Request, PowExpression, MetaParameterAssignment, Solution, Assignment, ResourceMapping, ComponentMapping, AddExpression, SubExpression, MultExpression, DivExpression
}
