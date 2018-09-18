/**
* Class for representing the component frame of a bike.
* It has methods to print its value.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Frame {
    private String frame;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Frame() {
        this.frame = "Frame";
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param frame The type of frame for the new instance.
    * @return An instance of this class.
    */
    public Frame(String frame) {
        this.frame = frame;
    }

    /**
    * Get the attribute frame of the instance.
    * @return the value of the attribute.
    */
    private String getFrame() {
        return this.frame;
    }
    
    /**
    * Prints the attributes of the instance.
    */
    public void printFrame() {
        System.out.println(getFrame());
    }
}