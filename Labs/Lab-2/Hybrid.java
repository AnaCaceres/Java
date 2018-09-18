public class Hybrid extends Bike{

    private Frame frame;
    private Light frontLight;
    private Light rearLight;

    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public Hybrid() {
        super("Hybrid");
        this.frame = new Frame("MediumFrame");
        this.frontLight = new Light("FrontLight");
        this.rearLight = new Light("RearLight");
    }

    /**
    * Prints the attributes of the instance.
    */
    public void printComponents() {
        super.printComponents();
        this.frame.printFrame();
        this.frontLight.printLight();
        this.rearLight.printLight();
    }

}