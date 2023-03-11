public abstract class Pet extends Animal {
    String nickname;
    String breed;
    boolean vaccinations;
    String colorOfAnimal;
    String birthdate;

    public Pet(int growth, int weight, String colorOfEyes, String nickname, String breed, boolean vaccinations,
            String colorOfAnimal, String birthdate) {
        super(growth, weight, colorOfEyes);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.colorOfAnimal = colorOfAnimal;
        this.birthdate = birthdate;
    }

    public abstract void showAffection();

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("кличка: %s, порода: %s, наличие прививок: %b, цвет шерсти: %s, дата рождения: %s, ",
                nickname,
                breed, vaccinations, colorOfAnimal, birthdate);
    }

}
