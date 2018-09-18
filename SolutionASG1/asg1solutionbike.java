public abstract class Bike{
    private final Wheels DEFAULT_WHEELS = new Wheels();
    private final Brakes DEFAULT_BRAKES = new Brakes();
    private final Wheels wheels;
    private final Brakes brakes;

    public Bike(final Brakes brakes, final Wheels wheels){
        this.brakes = brakes;
        this.wheels = wheels;
    }

    public Bike(){
        this(DEFAULT_BRAKES, DEFAULT_WHEELS);
    }
    
    public Bike(final Brakes brakes){
        this(brakes, DEFAULT_WHEELS);
    }
    
    public Bike(final Wheels wheels){
        this(DEFAULT_BRAKES, wheels);
    }


    public void printComponents(){
        brakes.println();
        wheels.println();
    }
    
    public static void main(final String[] args){
        
    }
}