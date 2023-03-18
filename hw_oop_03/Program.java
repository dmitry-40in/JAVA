public class Program {
    public static void main(String[] args) {

        ShapesCollection x = new ShapesCollection();

        Square a = new Square(5);
        x.addShape(a);
        // System.out.printf("Фигура %s\n", a.getShapeType());
        // System.out.printf("Периметр %d\n", a.getShapePerimeter());
        // System.out.printf("Площадь %d\n", a.getShapeArea());

        Square c = new Square(10);
        x.addShape(c);
        // System.out.printf("Фигура %s\n", c.getShapeType());
        // System.out.printf("Периметр %d\n", c.getShapePerimeter());
        // System.out.printf("Площадь %d\n", c.getShapeArea());

        Triangle b = new Triangle(9, 9, 10);
        x.addShape(b);
        // System.out.printf("Фигура %s\n", b.getShapeType());
        // System.out.printf("Периметр %d\n", b.getShapePerimeter());
        // System.out.printf("Площадь %d\n", b.getShapeArea());

        Сircle d = new Сircle(25);
        x.addShape(d);
        // System.out.printf("Фигура %s\n", d.getShapeType());
        // System.out.printf("Периметр %d\n", d.getShapePerimeter());
        // System.out.printf("Длина окружности %d\n", d.getLength());
        // System.out.printf("Площадь %d\n", d.getShapeArea());

        x.printInfoOfShapes();
        // x.removeShape(1);
        x.sort();
        x.printInfoOfShapes();

        // System.out.println(x.get);
    }

}
