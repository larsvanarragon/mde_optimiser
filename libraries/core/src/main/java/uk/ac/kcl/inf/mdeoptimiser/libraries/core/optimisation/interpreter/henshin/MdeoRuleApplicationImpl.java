package uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.henshin;

import java.util.ArrayList;

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Rule;

public class MdeoRuleApplicationImpl extends RuleApplicationImpl {
  
  public static ArrayList<Long> timings = new ArrayList<>();
  public static ArrayList<Long> mutationTimings = new ArrayList<>();

  public MdeoRuleApplicationImpl(Engine engine) {
    super(engine);
  }

  @Override
  public boolean execute(ApplicationMonitor monitor) {

    if (unit == null) {
      throw new NullPointerException("No transformation unit set");
    }

    // Already executed?
    if (isExecuted) {
      if (isCompleteMatchDerived) {
        completeMatch = null; // reset the complete match if it was derived
        isCompleteMatchDerived = false;
      }
      isExecuted = false;
      isUndone = false;
      change = null;
      resultMatch = null;
    }

    // Do we need to derive a complete match?
    if (completeMatch == null) {
      long startTime = System.nanoTime();
      completeMatch = engine.findMatches((Rule) unit, graph, partialMatch).iterator().next();
      timings.add(System.nanoTime() - startTime);
      
      isCompleteMatchDerived = true;
    }

    if (completeMatch == null) {
      if (monitor != null) {
        monitor.notifyExecute(this, false);
      }
      return false;
    }

    long mutationStartTime = System.nanoTime();
    
    resultMatch = new MatchImpl((Rule) unit, true);
    change = engine.createChange((Rule) unit, graph, completeMatch, resultMatch);

    if (change == null) {
      if (monitor != null) {
        monitor.notifyExecute(this, false);
      }
      return false;
    }

    change.applyAndReverse();
    isExecuted = true;
    
    mutationTimings.add(System.nanoTime() - mutationStartTime);

    if (monitor != null) {
      monitor.notifyExecute(this, true);
    }

    return true;
  }
}
