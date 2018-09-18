public final class MountainBike extends Bike {
    private static final Wheels DEFAULT_WHEELS = new Wheels( new ComponentType("aluminium"));
    private static final Brakes DEFAULT_BRAKES = new Brakes( new ComponentType("strong"));
    private final LowFrame frame;
    
    public MountainBike(final LowFrame frame ){
        super(DEFAULT_BRAKES, DEFAULT_WHEELS);
        this.frame = frame;
    }

    @Override
    public void printComponents(){
        super.printComponents();
        frame.println();
    }

    public static void main(String[] args){
        final Bike bike = new MountainBike(new LowFrame());
        bike.printComponents();
    }
}