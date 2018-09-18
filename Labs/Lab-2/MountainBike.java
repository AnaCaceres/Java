/**
* Class for representing a Mountain Bike which is inherited of a common Bike.
* It has methods to print its components.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class MountainBike extends Bike{

    private Frame frame;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public MountainBike() {
        super("Mountain Bike");
        this.frame = new Frame("LowFrame");
    }

    /**
    * Prints the attributes of the instance.
    */
    public void printComponents() {
        super.printComponents();
        this.frame.printFrame();
    }

}