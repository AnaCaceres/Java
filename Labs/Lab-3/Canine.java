/**
* Class for representing a Canine.
* It has methods to print its basic habits.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Canine implements Animal{
    
    private static final int CANINE_HUNGER_LEVEL = 5;
    private static final String CANINE_PICTURE = "canine.jpg";
    private static final boolean eatsGrass = false;
    private static final String sound = "Woof. Woof.";
    private static final String roam = "Roaming in my pack.";
    private ConcreteAnimal canine;

    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Canine( ){
        canine = new ConcreteAnimal( sound, CANINE_HUNGER_LEVEL, CANINE_PICTURE, eatsGrass, roam );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @param picture The picture of the canine for
    * the new instance.
    * @return An instance of this class.
    */
    public Canine( final int hunger, final String picture ){
        canine = new ConcreteAnimal( sound, hunger, picture, eatsGrass, roam );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @return An instance of this class.
    */
    public Canine( final int hunger ){
        canine = new ConcreteAnimal( sound, hunger, CANINE_PICTURE, eatsGrass, roam );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param picture The picture of the canine for
    * the new instance.
    * @return An instance of this class.
    */
    public Canine( final String picture ){
        canine = new ConcreteAnimal( sound, CANINE_HUNGER_LEVEL, picture, eatsGrass, roam );
    }
    
     @Override
    /**
    * Delegates the implementation to
    * the eat method of the class ConcreteAnimal.
    */
    public void eat( ){
        canine.eat( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the roam method of the class ConcreteAnimal
    */
    public void roam( ) { 
        canine.roam( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the makeNoise method of the class ConcreteAnimal
    */
    public void makeNoise( ) {
        canine.makeNoise( );
    }

}