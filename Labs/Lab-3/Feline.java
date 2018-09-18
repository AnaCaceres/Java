/**
* Class for representing a Feline.
* It has methods to print its basic habits.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Feline implements Animal{
    
    private static final int FELINE_HUNGER_LEVEL = 3;
    private static final String FELINE_PICTURE = "feline.jpg";
    private static final boolean eatsGrass = false;
    private static final String sound = "Mew. Mew.";
    private static final String roam = "Roaming alone.";
    private ConcreteAnimal feline;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Feline( ){
        feline = new ConcreteAnimal( sound, FELINE_HUNGER_LEVEL, FELINE_PICTURE, eatsGrass, roam );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @param picture The picture of the feline for
    * the new instance.
    * @return An instance of this class.
    */
    public Feline( final int hunger, final String picture ){
        feline = new ConcreteAnimal( sound, hunger, 
                 picture, eatsGrass, roam );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @return An instance of this class.
    */
    public Feline( final int hunger ){
        feline = new ConcreteAnimal( sound, hunger, 
                 FELINE_PICTURE, eatsGrass, roam );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param picture The picture of the feline for
    * the new instance.
    * @return An instance of this class.
    */
    public Feline( final String picture ){
        feline = new ConcreteAnimal( sound, 
                 FELINE_HUNGER_LEVEL, picture, eatsGrass, roam );
    }
    
     @Override
    /**
    * Delegates the implementation to
    * the eat method of the class ConcreteAnimal.
    */
    public void eat( ){
        feline.eat( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the roam method of the class ConcreteAnimal.
    */
    public void roam( ) { 
        feline.roam( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the makeNoise method of the class ConcreteAnimal.
    */
    public void makeNoise( ) {
        feline.makeNoise( );
    }

}