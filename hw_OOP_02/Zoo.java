import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animalsArray;

    public Zoo() {
        this.animalsArray = new ArrayList<Animal>();
    }

    public void addZooResident(Animal zooResident) {
        this.animalsArray.add(zooResident);
    }

    public void removeZooResidentI(int index) {
        this.animalsArray.remove(index - 1);
    }

    public void showInfoAboutZooResidentI(int index) {
        System.out.printf("Это животное класса \"%s\". ", animalsArray.get(index - 1).getClass().getName());
        animalsArray.get(index - 1).printInfo();
    }

    public void makeSoundZooResidentI(int index) {
        if (animalsArray.get(index - 1) instanceof Stork) {
            Stork x = (Stork) animalsArray.get(index - 1);
            x.sound();
        }

        else if (animalsArray.get(index - 1) instanceof Chicken) {
            Chicken x = (Chicken) animalsArray.get(index - 1);
            x.sound();
        }

        else if (animalsArray.get(index - 1) instanceof Dog) {
            Dog x = (Dog) animalsArray.get(index - 1);
            x.sound();
        }

        else if (animalsArray.get(index - 1) instanceof Cat) {
            Cat x = (Cat) animalsArray.get(index - 1);
            x.sound();
        }

        else if (animalsArray.get(index - 1) instanceof Wolf) {
            Wolf x = (Wolf) animalsArray.get(index - 1);
            x.sound();
        }

        else {
            Tiger x = (Tiger) animalsArray.get(index - 1);
            x.sound();
        }

    }

    public void printInfoAllZooResidents() {
        for (int i = 0; i < animalsArray.size(); i++) {
            System.out.printf("№ %d: класс \"%s\". ", i + 1, animalsArray.get(i).getClass().getName());
            animalsArray.get(i).printInfo();
        }
    }

    public void makeSoundAllZooResidents() {
        for (Animal animal : animalsArray) {
            if (animal instanceof Stork) {
                Stork x = (Stork) animal;
                x.sound();
            }
    
            else if (animal instanceof Chicken) {
                Chicken x = (Chicken) animal;
                x.sound();
            }
    
            else if (animal instanceof Dog) {
                Dog x = (Dog) animal;
                x.sound();
            }
    
            else if (animal instanceof Cat) {
                Cat x = (Cat) animal;
                x.sound();
            }
    
            else if (animal instanceof Wolf) {
                Wolf x = (Wolf) animal;
                x.sound();
            }
    
            else {
                Tiger x = (Tiger) animal;
                x.sound();
            }

        }

    }

    public void featureActionForZooResidentI(int index) {
        
            if (animalsArray.get(index - 1) instanceof Bird) {
                Bird y = (Bird) animalsArray.get(index - 1);
                y.imFly();
            }

            else if (animalsArray.get(index - 1) instanceof Dog) {
                Dog y = (Dog) animalsArray.get(index - 1);
                y.getTrainig();
                if (y.getTrainig() == false) {
                    y.makeTraining();
                    y.showAffection();
                }
                else {
                    System.out.println("Собака дрессирована.");
                    y.showAffection();
                }
            }

            else if (animalsArray.get(index - 1) instanceof Pet) {
                Pet y = (Pet) animalsArray.get(index - 1);
                y.showAffection();
            }

            else {
                System.out.println("У этого животного нет особенностей. Выбери птицу или домашнее животное, собаку");
            }
        
        
    }

}
