package uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.mutation.application;

import java.util.ArrayList;
import java.util.LinkedList;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Unit;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.SearchOperatorConfiguration;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.mutation.repair.OperatorRepairStrategy;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.mutation.selection.OperatorSelectionStrategy;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.mutation.step.MutationStepSizeStrategy;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.parameters.AbstractStrategyParameter;

public abstract class AbstractMutationStrategy extends AbstractStrategyParameter
    implements MutationApplicationStrategy {

  protected final MutationStepSizeStrategy mutationStepSizeStrategy;
  protected final OperatorSelectionStrategy operatorSelectionStrategy;
  protected final OperatorRepairStrategy operatorRepairStrategy;
  
  public static ArrayList<Long> timings = new ArrayList<>();
  public static ArrayList<Long> mutationTimings = new ArrayList<>();

  public AbstractMutationStrategy(
      SearchOperatorConfiguration searchOperatorConfiguration,
      MutationStepSizeStrategy mutationStepSizeStrategy,
      OperatorSelectionStrategy operatorSelectionStrategy,
      OperatorRepairStrategy operatorRepairStrategy) {
    super(searchOperatorConfiguration);
    this.mutationStepSizeStrategy = mutationStepSizeStrategy;
    this.operatorSelectionStrategy = operatorSelectionStrategy;
    this.operatorRepairStrategy = operatorRepairStrategy;
  }

  public Solution mutate(Solution model) {
    long startTime = System.nanoTime();    
    var candidateSolution = new Solution(model);
    timings.add(System.nanoTime() - startTime);

    long mutationStartTime = System.nanoTime();
    
    var graph = new EGraphImpl(candidateSolution.getModel());

    var stepTransformations = applyOperators(candidateSolution, graph);

    candidateSolution.updateModel(graph.getRoots().get(0), stepTransformations);
    
    mutationTimings.add(System.nanoTime() - mutationStartTime);
    
    return candidateSolution;
  }

  abstract LinkedList<Unit> applyOperators(Solution candidateSolution, EGraphImpl graph);

  @Override
  public String getStrategyParameterKey() {
    return "mutation.strategy";
  }
}
