public class Program {
    public static void main(String[] args) {
        Square a = new Square(3,5);
        a.shapeType();
        a.printShapePerimeter();
        a.printShapeArea();
        

        System.out.println();

        Square aa = new Square(2, 4);
        aa.shapeType();
        aa.printShapePerimeter();
        aa.printShapeArea();

        System.out.println();

        Triangle b = new Triangle(4, 9,6);
        b.shapeType();
        b.printShapePerimeter();
        b.printShapeArea(); 

        System.out.println();

        Сircle c = new Сircle(10);
        c.shapeType();
        c.printLength();
        c.printShapeArea();
    }

}
