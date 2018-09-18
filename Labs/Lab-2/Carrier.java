/**
* Class for representing the component carrier of a bike.
* It has methods to print its value.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Carrier {
    private String carrier;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Carrier() {
        this.carrier = "Carrier";
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param carrier The type of carrier for the new instance.
    * @return An instance of this class.
    */
    public Carrier(String carrier) {
        this.carrier = carrier;
    }

     /**
    * Get the attribute carrier of the instance.
    * @return the value of the attribute.
    */
    private String getCarrier() {
        return this.carrier;
    }

    /**
    * Prints the attributes of the instance.
    */
    public void printCarrier() {
        System.out.println(getCarrier());
    }
}