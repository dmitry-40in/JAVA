public class Triangle extends Polygons {
    private int sideA;
    private int sideB;
    private int sideC;
    private int perimeter;
    private int area;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        setSide(this.sideA);
        setSide(this.sideB);
        setSide(this.sideC);
        this.perimeter = perimeterOut();
        this.area = (int)Math.sqrt(this.perimeter / 2 *(this.perimeter / 2 - getSide(0))*(this.perimeter / 2 - getSide(1))*(this.perimeter / 2 - getSide(2)));
    }

    public Triangle(int sideA, int sideC) {
        this(sideA, sideA, sideC);
    }

    public Triangle(int sideA) {
        this(sideA, sideA, sideA);
    }

    @Override
    public String getShapeType() {
        // в интерфейсе описать
        return "null";
    }
    
    @Override
    public int getShapePerimeter() {
        return this.perimeter;
    }

    @Override
    public int getShapeArea() {
        return this.area;
    }
}
