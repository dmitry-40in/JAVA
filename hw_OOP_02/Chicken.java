public class Chicken extends Bird implements MakeSound {

    public Chicken(int growth, int weight, String colorOfEyes, int flightAltitude) {
        super(growth, weight, colorOfEyes, flightAltitude);
    }

    @Override
    public void sound() {
        System.out.println("Курица кудахтает: курлык-курлык...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(".");
    }

}
