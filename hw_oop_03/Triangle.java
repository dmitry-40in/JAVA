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
        sides.add(0, this.sideA);
        sides.add(1, this.sideB);
        sides.add(2, this.sideC);
        this.perimeter = perimeterOut(sides);
        this.area = (int)Math.sqrt(((sideA + sideB + sideC) / 2) * (((sideA + sideB + sideC) / 2) - sideA)*(((sideA + sideB + sideC) / 2) - sideB)*(((sideA + sideB + sideC) / 2) - sideA));
    }


    // public Triangle(int sideA, int sideC) {
    //     this(sideA, sideA, sideC);
    // }

    // public Triangle(int sideA) {
    //     this(sideA, sideA, sideA);
    // }

    // public int getPerimetr() {
    //     return this.perimeter;
    // }

    // private int area = (int)Math.sqrt(preArea);
    // public int getArea() {
    //     return this.area;
    // }
    // int area = 9;
    
    // int b = getPerimetr();

    @Override
    public void shapeType() {
        System.out.printf("Эта фигра - треугольник.\n");
    }
    

    

    @Override
    public void printShapePerimeter() {
        System.out.printf("Периметр равен %d\n", this.perimeter);
    }

    @Override
    public void printShapeArea() {    
        System.out.printf("Площадь равна %d\n", this.area);

    }

}
