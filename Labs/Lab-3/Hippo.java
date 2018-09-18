/**
* Class for representing a Hippo.
* It has methods to print its basic habits.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Hippo implements Animal{

    private static final int HIPPO_HUNGER_LEVEL = 10;
    private static final String HIPPO_PICTURE = "hippo.jpg";
    private static final boolean eatsGrass = true;
    private static final String sound = "Grunt.";
    private static final String roam = "I’m Lazy: not roaming.";
    private ConcreteAnimal hippo;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Hippo(){
        hippo = new ConcreteAnimal( sound, HIPPO_HUNGER_LEVEL, HIPPO_PICTURE, eatsGrass, roam );
    }
    
    @Override
    /**
    * Delegates the implementation to
    * the eat method of the class ConcreteAnimal
    */
    public void eat( ){
        hippo.eat( );
    }

    @Override
    /**
    * Delegates the implementation to
    * the roam method of the class ConcreteAnimal
    */
    public void roam( ) { 
        hippo.roam( );
    }

    @Override
    /**
    * Delegates the implementation to
    * the makeNoise method of the class ConcreteAnimal
    */
    public void makeNoise( ) {
        hippo.makeNoise( );
    }

}