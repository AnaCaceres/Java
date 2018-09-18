import java.util.ArrayList;

public class Main {
    public static void main( final String[] args ) {
        final ArrayList<Animal> animals = new ArrayList<Animal>( );

        animals.add( new Cat( ) );
        animals.add( new Dog( ) );
        animals.add( new Hippo( ) );
        for (Animal animal : animals) {
            System.out.println( "next: " + animal );
            animal.roam( );
            animal.eat( );
            animal.makeNoise( );
        }
    }
}