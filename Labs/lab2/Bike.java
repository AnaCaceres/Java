/**
* Class for representing a general bike.
* It has methods to print its basic components which are other objects.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Bike {

    private String type;
    private Brake brakes = new Brake();
    private Wheel wheels = new Wheel();
    private Saddle saddle = new Saddle();
    private Handlebar handlebar = new Handlebar();
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Bike() {
        this.type = "Bike";
    }

    /**   
    * Construct an instance of this class.
    *
    * @param type The type for the new instance.
    * @return An instance of this class.
    */
    public Bike(String type) {
        this.type = type;
    }
    
    /**
    * Prints the attributes of the instance.
    */
    public void printComponents() {
        System.out.println("This are the components of a bike type " + type + ": ");
        this.brakes.printBrakes();
        this.wheels.printWheels();
        this.saddle.printSaddle();
        this.handlebar.printHandlebar();
    }

}