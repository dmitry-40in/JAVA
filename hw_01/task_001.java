// Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class task_001 {
    public static void main(String[] args) {
        // int n = inputNumber();
        // System.out.print(n);
       
    }    

    static int inputNumber () {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Для расчета n-ого треугольного числа необходимо задать n.");
        System.out.printf("n = ");
        int number = iScanner.nextInt();
        iScanner.close(); 
        return number;
    }
}