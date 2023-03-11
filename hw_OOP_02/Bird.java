public abstract class Bird extends Animal {
    private int flightAltitude;

    protected Bird(int growth, int weight, String colorOfEyes, int flightAltitude) {
        super(growth, weight, colorOfEyes);
        this.flightAltitude = flightAltitude;
    }

    public void imFly() {
        System.out.println("Я лечу на " + flightAltitude + " метрах.");
    }

}
