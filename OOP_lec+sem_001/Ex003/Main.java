public class Main {
    public static void main(String[] args) {
        System.out.println("starting");

        Point dot = new Point();
        dot.column = 10;
        dot.row = 111;
        System.out.printf("column: %d   row: %d", dot.column, dot.row);
        // но нельзя обратиться сразу column и row
        System.out.println();

        PPPoint sky = new PPPoint(5, 25, 325);
        System.out.println(sky.getX() + " " + sky.pointY + " " + sky.pointZ);
        sky.setX(777);
        System.out.println(sky.getX() + " " + sky.pointY + " " + sky.pointZ);
        System.out.println(sky.pointY + " " + sky.pointZ);

        PPPoint water = new PPPoint(10);
        System.out.println(water.pointY + " " + water.pointZ);

        Point a = new Point();
        a.column = 1;
        a.row = 1;

        Point b = new Point();
        b.column = 10;
        b.row = 10;

        Point.distance(a, b);
        System.out.println(dis);
    }
}
