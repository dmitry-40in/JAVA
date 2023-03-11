public abstract class Animal {
    int growth;
    int weight;
    String colorOfEyes;

    public Animal(int growth, int weight, String colorOfEyes) {
        this.growth = growth;
        this.weight = weight;
        this.colorOfEyes = colorOfEyes;
    }

    // public abstract void makeSound();

    public void printInfo() {
        System.out.printf("Рост животного: %d, вес животного: %d, цвет глаз животного: %s, ", growth, weight,
                colorOfEyes);
    }

}