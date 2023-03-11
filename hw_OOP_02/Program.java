public class Program {
    public static void main(String[] args) {
        Tiger t = new Tiger(182, 74, "карие", "рф", "1.1.3");
        t.sound();
        t.printInfo();

        Wolf w = new Wolf(99, 99, "sdfsdf", "sdfsdf", "234234.234", true);
        w.sound();
        w.printInfo();
        System.out.println(w.getAlpha());

        Cat c = new Cat(12, 1232, "asdasd", "dfg", "er", true, "null", "null", false);
        c.sound();
        c.printInfo();
        c.showAffection();
        System.out.println(c.getWool());

        Dog d = new Dog(123, 123, "null", "null", "null", false, "null", "null", false);
        d.sound();
        d.printInfo();
        d.showAffection();
        System.out.println(d.getTrainig());
        d.makeTraining();
        System.out.println(d.getTrainig());

        Chicken ch = new Chicken(4, 4, "white", 5);
        ch.sound();
        ch.printInfo();
        ch.imFly();

        Stork s = new Stork(10, 10, "white", 1000);
        s.sound();
        s.printInfo();
        s.imFly();

        System.out.println("=====");

        Zoo myZoo = new Zoo();
        myZoo.addZooResident(s);
        myZoo.addZooResident(d);
        myZoo.showInfoAboutZooResidentI(1);
        // myZoo.removeZooResidentI(1);
        myZoo.showInfoAboutZooResidentI(2);
        myZoo.makeSoundZooResidentI(2);

        System.out.println("=====");

        myZoo.printInfoAllZooResidents();
        
        System.out.println("=====");

        myZoo.makeSoundAllZooResidents();

    }
}
