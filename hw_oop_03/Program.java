public class Program {
    public static void main(String[] args) {
        Square a = new Square(3);
        a.shapeType();
        a.perimeterOut();
        a.printShapeArea();

        Triangle b = new Triangle(4, 9,6);
        b.shapeType();
        b.perimeterOut();
        b.printShapeArea(); // ПЛОЩАДЬ считает неправильно


    }

}
