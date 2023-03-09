
public class Program {
    public static void main(String[] args) {

        Point a = new Point(5, 10);
        // a.x = 5;
        // a.y = 10;
        Point b = new Point(8, 8);

        System.out.printf("Ax: %d, Ay: %d", a.x, a.y);
        System.out.printf("Bx: %d, By: %d", b.x, b.y);

        System.out.println("\n");

        System.out.println("B:" + " " + b.toString());
        System.out.println("B:" + " " + b.getInfo());

        System.out.println(a);
    }

}

class Point {
    int x;
    int y;

    public Point(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }

    String getInfo() {
        return String.format("x: %d; y %d", x, y);
    }

    @Override // Это переопределение, а не перегрузка метода (ну так называют). Вообще перегрузка - это когда:
    // описывать в рамках одной сущности методы отличающиеся однной СИГНАТУРЫ (наборы типов) (отличаются кол-вом аргументов или типом данных)
    // но в джаве нельзя сделать перегрузку по имени аргументов (int a, int b, int c и на int a, int b, int d)
    public String toString() {
        return String.format("toString() x: %d; y %d", x, y);
    }
}
