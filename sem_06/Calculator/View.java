package Calculator;

import java.util.Scanner;

public class View {
    
    Scanner in = new Scanner(System.in);  // Scanner(System.in) - непонятно, и почему не in.close()

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    
}
