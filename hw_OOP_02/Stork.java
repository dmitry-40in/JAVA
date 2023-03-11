public class Stork extends Bird implements MakeSound {

    public Stork(int growth, int weight, String colorOfEyes, int flightAltitude) {
        super(growth, weight, colorOfEyes, flightAltitude);
    }

    @Override
    public void sound() {
        System.out.println("Аист издает странные звуки...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(".");
    }

}
