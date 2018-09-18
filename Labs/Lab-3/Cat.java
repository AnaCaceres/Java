/**
* Class for representing a Cat.
* It has methods to print its basic habits.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Cat implements Animal{
    
    private static final int CAT_HUNGER_LEVEL = 1;
    private static final String CAT_PICTURE = "cat.jpg";
    private Feline cat;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Cat( ) {
       cat = new Feline(CAT_HUNGER_LEVEL, CAT_PICTURE);
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @param picture The picture of the cat for
    * the new instance.
    * @return An instance of this class.
    */
    public Cat( final int hunger, final String picture ){
        cat = new Feline( hunger, picture);
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param hunger The level of hunger of the new instance.
    * @return An instance of this class.
    */
    public Cat( final int hunger ){
        cat = new Feline( hunger, CAT_PICTURE);
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param picture The picture of the cat for
    * the new instance.
    * @return An instance of this class.
    */
    public Cat( final String picture ){
        cat = new Feline(CAT_HUNGER_LEVEL, picture);
    }
    
     @Override
    /**
    * Delegates the implementation to
    * the eat method of the class Feline.
    */
    public void eat( ){
        cat.eat( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the roam method of the class Feline.
    */
    public void roam( ) { 
        cat.roam( );
    }

     @Override
    /**
    * Delegates the implementation to
    * the makeNoise method of the class Feline.
    */
    public void makeNoise( ) {
        cat.makeNoise( );
    }

}