class Main {
    public static void main(String[] args) {
        Bike a = new Bike();
        a.printComponents();
        Bike b = new MountainBike();
        b.printComponents();
        Bike c = new Hybrid();
        c.printComponents();
        Bike d = new CityBike();
        d.printComponents();
    }
}