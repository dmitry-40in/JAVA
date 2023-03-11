public class Tiger extends WildAnimal implements MakeSound {
    public Tiger(int growth, int weight, String colorOfEyes, String habitat, String dateOfLocation) {
        super(growth, weight, colorOfEyes, habitat, dateOfLocation);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(".");
    }

    @Override
    public void sound() {
        System.out.println("Тигр рычит: р-р-ррр...");
    }

    // @Override
    // public void makeSound() {
    // System.out.println("Тигр рычит: р-р-ррр...");
    // }
}
