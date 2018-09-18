/**
* Class for representing an Animal.
* It has methods to print its basic habits.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class ConcreteAnimal implements Animal{
    private final String sound;
    private final int hungerLevel;
    private final String picture;
    private final boolean eatsGrass;
    private final String roam;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public ConcreteAnimal( final String sound, final int hungerLevel, final String picture, final boolean eatsGrass, final String roam) {
        this.sound = sound;
        this.hungerLevel = hungerLevel;
        this.picture = picture;
        this.eatsGrass = eatsGrass;
        this.roam = roam;
    }
    
    private String food( ){
        return (eatsGrass ? "grass" : "meat");
    }
    
     @Override
    /**
    * Prints the sound of the animal.
    */
    public void makeNoise( ) {
        System.out.println( sound );
    }
    
     @Override
    /**
    * Prints what the animal eats.
    */
    public void eat( ){
        System.out.println( "Eating " + hungerLevel + " portions of " + food( ) + "." );
    }
    
     @Override
    /**
    * Prints how the animal roam.
    */
    public void roam( ) {
        System.out.println( roam );
    }
}