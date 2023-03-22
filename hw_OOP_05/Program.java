import java.util.Scanner;

public class Program extends RPN {
    public static void main(String[] args) {

        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        RPN e = new RPN();

        while (menu) {
            System.out.println();
            System.out.println("1 -> Сосчитать выражение.");
            System.out.println("0 -> Выйти из программы.");

            System.out.printf("Ваш выбор: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.printf("Введите выражение без пробелов: ");
                String input = scanner.next();
                System.out.println();
                String r = e.getRPN(input);

                System.out.printf("Ответ: %f\n", e.getResult(r));

            } else {
                System.out.println("Досвидания!");
                break;
            }
        }
        scanner.close();
    }

}
