import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean enterZoo = true;
        
        System.out.println("Привет! Твой зоопарк пустой. Засели его!");
        
        Scanner scanner = new Scanner(System.in);
        Zoo myZoo = new Zoo();
        
        while (enterZoo) {
            boolean enterZooAdd = true;
            int index = 0;

            System.out.println();
            
            System.out.println("1 -> Добавить животное в зоопарк.");
            System.out.println("2 -> Убрать животное с номером i из зоопарка.");
            System.out.println("3 -> Посмотреть информацию о животном с номером i.");
            System.out.println("4 -> Заставить животное с номером i издать звук.");
            System.out.println("5 -> Напечатать информацию о животных, которые есть на данный момент в зоопарке.");
            System.out.println("6 -> Заставить всех животных, которые на данный момент есть в зоопарке, издать звук.");
            System.out.println("7 -> *feature*");
            System.out.println("0 -> Покинуть зоопарк.");

            System.out.printf("Твой выбор: ");
            int choice = scanner.nextInt();
            System.out.println("Выбран вариант: " + choice + ".");

            switch (choice) {
                case 1:
                    while (enterZooAdd) {
                        System.out.println();
                        System.out.println("Какое животное заселишь?");

                        System.out.println("1 -> Котика.");
                        System.out.println("2 -> Собачку.");
                        System.out.println("3 -> Тигра.");
                        System.out.println("4 -> Волка.");
                        System.out.println("5 -> Курицу.");
                        System.out.println("6 -> Аиста.");
                        System.out.println("0 -> Я передумал заселять животное.");

                        System.out.printf("Твой выбор: ");
                        int zooAdd = scanner.nextInt();
                        // System.out.println("Выбран вариант: " + choice + ".");
                        switch (zooAdd) {
                            case 1:
                                Cat cat = new Cat(50,  5, "зеленые", "Kitty",  "Шотландская вислоухая", true,
                            "серая", "01.01.2020", true);
                                myZoo.addZooResident(cat);
                                break;
                            case 2:
                                Dog dog = new Dog(1000, 30, "карии", "Boy", "Доберман", true, "черная и коричневая", "05.08.2015", false);
                                myZoo.addZooResident(dog);
                                break;
                            case 3:
                                Tiger tiger = new Tiger(2500, 500, "желтые", "Африка", "11.11.2021");
                                myZoo.addZooResident(tiger);
                                break;
                            case 4:
                                Wolf wolf = new Wolf(1200, 50, "серые", "Сибирь", "12.05.2021", true);
                                myZoo.addZooResident(wolf);
                                break;
                            case 5:
                                Chicken chicken = new Chicken(30, 2, "зеленые", 5);
                                myZoo.addZooResident(chicken);
                                break;
                            case 6:
                                Stork stork = new Stork(2, 25, "желтый", 500);
                                myZoo.addZooResident(stork);
                                break;
                            case 0:
                                enterZooAdd = false;
                                break;
                            default:
                                System.out.println("Неверное значение, повторите выбор!");
                                break;
                        }
                    }    
                    break;
                case 2:
                    System.out.println();
                    System.out.printf("Выбери номер животного: ");
                    index = scanner.nextInt();
                    System.out.println("Животное №" + index + " покидает зоопарк.");
                    System.out.println();
                    myZoo.removeZooResidentI(index);
                    break;
                case 3:
                    System.out.println();
                    System.out.printf("Какое животное будешь смотреть, № ");
                    index = scanner.nextInt();
                    System.out.println("Животное №" + index);
                    System.out.println();
                    myZoo.showInfoAboutZooResidentI(index);
                    break;
                case 4:
                    System.out.println();
                    System.out.printf("Какое животное попроси издать звук, № ");
                    index = scanner.nextInt();
                    System.out.println("Животное №" + index);
                    System.out.println();
                    myZoo.makeSoundZooResidentI(index);
                    break;
                case 5:
                    System.out.println();
                    myZoo.printInfoAllZooResidents();
                    break;
                case 6:
                    System.out.println();
                    myZoo.makeSoundAllZooResidents();
                    break;
                case 7:
                    System.out.println(); 
                    System.out.printf("Какого животного будем смотреть особенность, № ");
                    index = scanner.nextInt();
                    System.out.println("Животное №" + index);
                    System.out.println();
                    myZoo.featureActionForZooResidentI(index);            
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Досвидания!");
                    enterZoo = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Неверное значение, повторите выбор!");
                    break;
            }
  
        }
        scanner.close();   
    }
    
}
