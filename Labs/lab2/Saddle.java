/**
* Class for representing the component saddle of a bike.
* It has methods to print its value.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Saddle {
    private String saddle;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Saddle() {
        this.saddle = "Saddle";
    }
    
    /**   
    * Construct an instance of this class.
    *
    * @param saddle The type of saddle for the new instance.
    * @return An instance of this class.
    */
    public Saddle(String saddle) {
        this.saddle = saddle;
    }
    
    /**
    * Get the attribute saddle of the instance.
    * @return the value of the attribute.
    */
    private String getSaddle() {
        return this.saddle;
    }
    
    /**
    * Prints the attributes of the instance.
    */
    public void printSaddle() {
        System.out.println(getSaddle());
    }
}