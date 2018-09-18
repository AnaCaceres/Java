/**
* Class for representing a City which is inherited of the class Bike.
* It has methods to print its components.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class CityBike extends Bike{

    private Frame frame;
    private Carrier carrier;
    private Light frontLight;
    private Light rearLight;
    
    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public CityBike(){
        super("City Bike");
        this.frame = new Frame("HighFrame");
        this.carrier = new Carrier();
        this.frontLight = new Light("FrontLight");
        this.rearLight = new Light("RearLight");
    }

    /**
    * Prints the attributes of the instance.
    */
    public void printComponents() {
        super.printComponents();
        this.frame.printFrame();
        this.carrier.printCarrier();
        this.frontLight.printLight();
        this.rearLight.printLight();
    }

}