/**
* Class for representing the component brake of a bike.
* It has methods to print its value.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Brake {
    private String brake;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Brake() {
        this.brake = "Brakes";
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param brake The type of brake for the new instance.
    * @return An instance of this class.
    */
    public Brake(String brake) {
        this.brake = brake;
    }
    
    /**
    * Get the attribute brake of the instance.
    * @return the value of the attribute.
    */
    private String getBrakes() {
        return this.brake;
    }
    
    /**
    * Prints the attributes of the instance.
    */
    public void printBrakes() {
        System.out.println(getBrakes());
    }
}