/**
 * This is the second subclass of the GeneticFactory. This is the second configuration of implementing a GA. 
 * Here we have two abstract methods implemented, selectionChoice and crossoverChoice. 
 * These methods will decide at runtime what type of class to generate, depending on the input from the client.
 * This class has access to only it's own style of the elite, roulette selections. And also its own version
 * of the crossovers.
 * For configTwo here I have implemented its own version of these that are specific for this configuration.
 * These are denoted by the word Two at the end of each class , i.e. eliteSelectionTwo()
 * @author Ian Dempsey
 *
 */
public class configTwo extends GeneticFactory {

	
	protected Selection selectionChoice(String type) {
		// TODO Auto-generated method stub
		if(type.equals("elite")) {
			return new eliteSelectionTwo();
		}else if (type.equals("roulette")) {
			return new rouletteSelectionTwo();
		}else return null;
	}

	
	protected Crossover crossoverChoice(int numCross) {
		if(numCross == 1) {
			return new onePointCrossoverTwo();
			
		}else if(numCross == 2) {
			return new twoPointCrossoverTwo();
		}else return null;
	}

}