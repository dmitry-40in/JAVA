public class Dog extends Pet implements MakeSound {
    private boolean training;

    public Dog(int growth, int weight, String colorOfEyes, String nickname, String breed, boolean vaccinations,
            String colorOfAnimal, String birthdate, boolean training) {
        super(growth, weight, colorOfEyes, nickname, breed, vaccinations, colorOfAnimal, birthdate);
        this.training = training;
    }

    public boolean getTrainig() {
        return this.training;
    }

    public void makeTraining() {
        this.training = true;
    }

    @Override
    public void sound() {
        System.out.println("Собачка лает: гав-гав...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("наличие дрессировки: %b", training);
        System.out.println();
    }

    @Override
    public void showAffection() {
        System.out.println("Собачка ласкается:)");
    }
}
