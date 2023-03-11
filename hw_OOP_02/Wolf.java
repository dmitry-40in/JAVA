public class Wolf extends WildAnimal implements MakeSound {
    private boolean alpha;

    public Wolf(int growth, int weight, String colorOfEyes, String habitat, String dateOfLocation, boolean alpha) {
        super(growth, weight, colorOfEyes, habitat, dateOfLocation);
        this.alpha = alpha;
    }

    public boolean getAlpha() {
        return this.alpha;
    }

    @Override
    public void sound() {
        System.out.println("Волк воет: у-у-ууу...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf(", вожак стаи: %b", alpha);
        System.out.println(".");
    }
}
