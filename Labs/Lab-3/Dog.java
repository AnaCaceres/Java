/**
* Class for representing a Dog.
* It has methods to print its basic habits.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Dog implements Animal{
    
    private static final int DOG_HUNGER_LEVEL = 4;
    private static final String DOG_PICTURE = "dog.jpg";
    private Canine dog;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Dog( ) {
       dog = new Canine(DOG_HUNGER_LEVEL, DOG_PICTURE);
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @param picture The picture of the dog for
    * the new instance.
    * @return An instance of this class.
    */
    public Dog( final int hunger, final String picture ){
        dog = new Canine( hunger, picture );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @return An instance of this class.
    */
    public Dog( final int hunger ){
        dog = new Canine( hunger, DOG_PICTURE );
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param picture The picture of the dog for
    * the new instance.
    * @return An instance of this class.
    */
    public Dog( final String picture ){
        dog = new Canine( DOG_HUNGER_LEVEL, picture );
    }
    
     @Override
    /**
    * Delegates the implementation to
    * the eat method of the class Canine.
    */
    public void eat( ){
        dog.eat( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the roam method of the class Canine.
    */
    public void roam( ) { 
        dog.roam( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the makeNoise method of the class Canine.
    */
    public void makeNoise( ) {
        dog.makeNoise( );
    }

}