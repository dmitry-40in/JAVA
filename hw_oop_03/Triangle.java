public class Triangle extends Polygons implements ShapeType {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideC) {
        this(sideA, sideA, sideC);
    }

    public Triangle(int sideA) {
        this(sideA, sideA, sideA);
    }

    @Override
    public void shapeType() {
        System.out.printf("Эта фигра - треугольник.\n");
    }

    @Override
    public void perimeterOut() {
        sides.add(0, this.sideA);
        sides.add(1, this.sideB);
        sides.add(2, this.sideC);
        super.perimeterOut();
    }

    @Override
    public void printShapeArea() {
        int area = (int)Math.sqrt((sideA + sideB + sideC) * (sideB + sideC) * (sideA + sideC) * (sideA+sideB));      
        System.out.printf("Площадь равна %d\n", area);

    }

}
