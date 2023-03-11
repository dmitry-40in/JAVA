import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean enterZoo = true;
        
        System.out.println("Привет! Твой зоопарк пустой. Засели его!");
        
        Scanner scanner = new Scanner(System.in);
        Zoo myZoo = new Zoo();

        while (enterZoo) {
            boolean enterZooAdd = true;
            
            System.out.println("1 -> Добавить животное в зоопарк.");
            System.out.println("2 -> Убрать животное с номером i из зоопарка.");
            System.out.println("3 -> Посмотреть информацию о животном с номером i.");
            System.out.println("4 -> Заставить животное с номером i издать звук.");
            System.out.println("5 -> Напечатать информацию о животных, которые есть на данный момент в зоопарке.");
            System.out.println("6 -> Заставить всех животных, которые на данный момент есть в зоопарке, издать звук.");
            System.out.println("0 -> Покинуть зоопарк.");

            System.out.printf("Твой выбор: ");
            int choice = scanner.nextInt();
            System.out.println("Выбран вариант: " + choice + ".");

            switch (choice) {
                case 1:
                    while (enterZooAdd)
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
                    System.out.println("Выбран вариант: " + choice + ".");
                    switch (zooAdd) {
                        case 1:
                            Cat cat = new Cat(50,  5, "зеленые", "Kitty",  "Шотландская вислоухая", true,
                            "серая", "01.01.2020", true);
                            myZoo.addZooResident(cat);
                            break;
                        case 2:
                            Dog dog = new Dog(1000, 30, "карии", "Boy", "Доберман", true, "черная и коричневая", "05.08.2015", true);
                            myZoo.addZooResident(dog);
                            break;
                        case 3:
                            Tiger tiger = new Tiger(2500, 500, "желтые", "Африка", "11.11.2021");
                            myZoo.addZooResident(tiger);
                            break;
                        case value:
                            
                            break;
                        case value:
                            
                            break;
                        case value:
                            
                            break;
                        case 0:
                            enterZooAdd = false;
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 0:
                    System.out.println("Досвидания!");
                    enterZoo = false;
                    break;
                default:
                    System.out.println("Неверное значение, повторите выбор!");
                    break;
            }




            
        }
        scanner.close();   
    }
}
