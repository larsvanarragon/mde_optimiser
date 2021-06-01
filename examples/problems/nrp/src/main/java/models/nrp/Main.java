package models.nrp;

import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.xtext.testing.util.ParseHelper;

import com.google.inject.Injector;
import com.google.inject.Key;

import uk.ac.kcl.inf.mdeoptimiser.languages.MoptStandaloneSetup;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Optimisation;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.OptimisationInterpreter;

/**
 * TODO!!! Remove this class at the end, it's just a test class
 * TODO!!! Change back the files nrp.mopt, mutation.henshin and nrp-model-25-cus-50-req-203.xmi to use the .ecore instead 
 * @author Lars van Arragon
 *
 */
public class Main {

  public static void main(String[] args) throws Exception {
    Injector injector = new MoptStandaloneSetup().createInjectorAndDoEMFRegistration();
    ParseHelper<Optimisation> parseHelper = injector.getInstance(new Key<ParseHelper<Optimisation>>() {});
    
    Path mopt = Path.of("src/main/java/nrp.mopt");
    String modelSpec = Files.readString(mopt);
    
    Optimisation model = parseHelper.parse(modelSpec);
    
    var optimisationInterpreter = new OptimisationInterpreter("", model);
    var optimisationOutcome = optimisationInterpreter.start();
  }

}
