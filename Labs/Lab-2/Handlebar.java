/**
* Class for representing the component handlebar of a bike.
* It has methods to print its value.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Handlebar {
    private String handlebar;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Handlebar() {
        this.handlebar = "Handlebar";
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param handlebar The type of handlebar for the new instance.
    * @return An instance of this class.
    */
    public Handlebar(String handlebar) {
        this.handlebar = handlebar;
    }
    
    /**
    * Get the attribute handlebar of the instance.
    * @return the value of the attribute.
    */
    private String getHandlebar() {
        return this.handlebar;
    }
    
    /**
    * Prints the attributes of the instance.
    */
    public void printHandlebar() {
        System.out.println(getHandlebar());
    }
}