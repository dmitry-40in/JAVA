public class app6 {
    public static void main(String[] args) {
        System.out.println(5);
        System.out.println("qwerty");
        System.out.println(5.7);

        int x = 123;
        int y = 456;
        int res = x + y;

        System.out.println(x + " + " + y + " = " + res); // используем форматирование строк (маска). %10d или %-5 - делает отсутп

        System.out.printf("%d + %d = %d\n", x, y, res);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

    }
}
