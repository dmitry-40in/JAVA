public class Cat extends Pet implements MakeSound {
    private boolean wool;

    public Cat(int growth, int weight, String colorOfEyes, String nickname, String breed, boolean vaccinations,
            String colorOfAnimal, String birthdate, boolean wool) {
        super(growth, weight, colorOfEyes, nickname, breed, vaccinations, colorOfAnimal, birthdate);
        this.wool = wool;
    }

    public boolean getWool() {
        return this.wool;
    }

    @Override
    public void sound() {
        System.out.println("Котик мурчит: мур-ррр...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("наличие шерсти: %b", wool);
        System.out.println();
    }

    @Override
    public void showAffection() {
        System.out.println("Котик ласкается:)");
    }
}
