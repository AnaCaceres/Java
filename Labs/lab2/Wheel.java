/**
* Class for representing the component wheel of a bike.
* It has methods to print its value.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Wheel {
    private String wheels;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Wheel() {
        this.wheels = "Wheels";
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param wheels The type of wheels for the new instance.
    * @return An instance of this class.
    */
    public Wheel(String wheels) {
        this.wheels = wheels;
    }
    
    /**
    * Get the attribute wheels of the instance.
    * @return the value of the attribute.
    */
    private String getWheels() {
        return this.wheels;
    }
    
    /**
    * Prints the attributes of the instance.
    */
    public void printWheels() {
        System.out.println(getWheels());
    }
}