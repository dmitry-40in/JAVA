public class Square extends Polygons {
    private int sideA;
    private int sideB;
    private int perimeter;
    private int area;

    public Square(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        sides.add(0, sideA);
        sides.add(1, sideB);
        sides.add(2, sideA);
        sides.add(3, sideB);
        this.perimeter = perimeterOut(sides);
        this.area = sideA * sideB;
    } 
    
    public Square(int sideA) {
        this(sideA, sideA); 
    }

    public int getPerimeter() {
        return this.perimeter;
    }

    public int getArea() {
        return this.area;
    }

    @Override
    public void shapeType() {
        if (this.sideA == this.sideB) {
            System.out.printf("Эта фигра - квадрат.\n");
        }
        else {
            System.out.printf("Эта фигра - прямоугольник.\n");
        }
    }

    @Override
    public void printShapePerimeter() {
        System.out.printf("Периметр равен %d\n", this.perimeter);
    }
     
    @Override
    public void printShapeArea() {       
        System.out.printf("Площадь равна %d\n", area);
    }  

}
