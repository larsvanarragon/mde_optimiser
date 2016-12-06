package uk.ac.kcl.optimisation.moea

import java.util.Properties
import org.moeaframework.algorithm.NSGAII
import org.moeaframework.algorithm.SPEA2
import org.moeaframework.core.Algorithm
import org.moeaframework.core.NondominatedSortingPopulation
import org.moeaframework.core.Problem
import org.moeaframework.core.operator.RandomInitialization
import org.moeaframework.core.operator.TournamentSelection
import org.moeaframework.core.spi.AlgorithmProvider
import uk.ac.kcl.optimisation.SolutionGenerator
import org.moeaframework.algorithm.EpsilonMOEA
import org.moeaframework.core.EpsilonBoxDominanceArchive

class MoeaOptimisationAlgorithmProvider extends AlgorithmProvider {
	
	override getAlgorithm(String algorithm, Properties properties, Problem problem) {
		switch algorithm {
			case "NSGAII":
				return createNSGAII(problem, properties)
			case "SPEA2":
				return createSPEA2(problem, properties)
			case "eMOEA":
				return createeMOEA(problem, properties)
			default:
				throw new Exception("Invalid algorithm given: " + algorithm)
		}
	}
	
	def Algorithm createNSGAII(Problem problem, Properties properties) {
		//Create an initial random population of population size
		var initialization = new RandomInitialization(problem, properties.get("populationSize") as Integer)
		
		var selection = new TournamentSelection(2);
		
		var variation = new MoeaOptimisationVariation(properties.get("solutionGenerator") as SolutionGenerator)	
	
		new NSGAII(
				problem,
				new NondominatedSortingPopulation(),
				null, // no archive
				selection,
				variation,
				initialization
			);
	}
	
	def Algorithm createSPEA2(Problem problem, Properties properties) {
		
		var initialization = new RandomInitialization(problem, properties.get("populationSize") as Integer)
		
		var variation = new MoeaOptimisationVariation(properties.get("solutionGenerator") as SolutionGenerator)	
	
		new SPEA2(
				problem,
				initialization,
				variation,
				properties.get("populationSize") as Integer,
				1
			);
	}
	
	def Algorithm createeMOEA(Problem problem, Properties properties) {
		
		//Create an initial random population of population size
		var initialization = new RandomInitialization(problem, properties.get("populationSize") as Integer)
		
		
		var selection = new TournamentSelection(2);
		
		var variation = new MoeaOptimisationVariation(properties.get("solutionGenerator") as SolutionGenerator)	
	
		new EpsilonMOEA(
				problem,
				new NondominatedSortingPopulation(),
				new EpsilonBoxDominanceArchive(0.01),
				selection, 
				variation,
				initialization
			);
	}
	
}