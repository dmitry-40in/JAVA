import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program extends RPN {
    public static void main(String[] args) throws IOException {

        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        RPN expression = new RPN();
        FileWriter log = new FileWriter("log.txt");

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
                String rpn = expression.getRPN(input);

                log.write("The entered expression: " + input + "\n");
                log.write("Expression in the RPN: " + rpn + "\n");
                log.write("Calculation result: " + expression.getResult(rpn) + "\n\n");

                System.out.printf("Ответ: %f\n", expression.getResult(rpn));


            } else {
                System.out.println("Досвидания!");
                break;
            }
        }
        log.close();
        scanner.close();
    }

}
