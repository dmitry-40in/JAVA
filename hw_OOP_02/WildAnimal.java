public abstract class WildAnimal extends Animal {
    String habitat;
    String dateOfLocation;

    public WildAnimal(int growth, int weight, String colorOfEyes, String habitat, String dateOfLocation) {
        super(growth, weight, colorOfEyes);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("место обитания: %s, дата нахождения: %s", habitat, dateOfLocation);
    }

}
