package View;

import java.util.Scanner;

public class ViewConsole implements ViewRealization {

    @Override
    public String getInfixExpression() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите выражение без пробелов: ");
        String expression = scanner.next();
        scanner.close();
        return expression;
    }

    @Override
    public void resultV(double result) {
        System.out.printf("result = %f\n", result);
    }

}
