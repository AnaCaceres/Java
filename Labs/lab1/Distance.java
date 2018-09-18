/**
* Class for representing a distance in meters.
* It has methods to get its equivalent in inches or feet as well as 
* for printing them.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Distance {
    public static final double DISTANCE_METERS = 5.00;
    private static final double METERS_PER_INCH = 0.0254;
    private static final double METERS_PER_FOOT = 0.3048;
    
    private final double distance_meters;
    
    public Distance( final double distance_meters ) {
        this.distance_meters = distance_meters;
    }
    
    /**
    *
    * Class instance method for getting the distance in meters.
    *
    * @return The distance in meters.
    */
    public double getMeters( ) {
        return distance_meters;
    }
    
    /**
    *
    * Class instance method for getting the distance in inches.
    *
    * @return The distance in inches.
    */
    public double getInches( ) {
        return getMeters( ) / METERS_PER_INCH;
    }
    
    /**
    *
    * Class instance method for getting the distance in feet.
    *
    * @return The distance in feet.
    */
    public double getFeet( ) {
        return getMeters( ) / METERS_PER_FOOT;
    }
    
    /**
    *
    * Class instance method for printing the distance in meters.
    *
    */
    public void printMeter( ) {
        System.out.println( "The distance in meters is: " + getMeters( ) + " m." );
    }
    
    /**
    *
    * Class instance method for printing the distance in inches.
    *
    */
    public void printInches( ) {
        System.out.println( "The distance in inches is: " + getInches( ) + " in." );
    }
    
    /**
    *
    * Class instance method for printing the distance in feet.
    *
    */
    public void printFeet( ) {
        System.out.println( "The distance in feet is: " + getFeet( )+ " ft." );
    }
    
    public static void main( String[] args ) {
        Distance distance = new Distance( Distance.DISTANCE_METERS );
        
        distance.printMeter( );
        distance.printInches( );
        distance.printFeet( );        
    }
}