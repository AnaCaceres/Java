/**
* Class for representing the component light of a bike.
* It has methods to print its value.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Light {
    private String light;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Light() {
        this.light = "Light";
    }

    /**   
    * Construct an instance of this class.
    *
    * @param light The type of light for the new instance.
    * @return An instance of this class.
    */
    public Light(String light) {
        this.light = light;
    }
    
    /**
    * Get the attribute light of the instance.
    * @return the value of the attribute.
    */
    private String getLight() {
        return this.light;
    }
    
    /**
    * Prints the attributes of the instance.
    */
    public void printLight() {
        System.out.println(getLight());
    }
}