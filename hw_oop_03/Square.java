public class Square extends Polygons implements ShapeType{
    private int sideA;
    private int sideB;

    public Square(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    } 
    
    public Square(int sideA) {
        this(sideA, sideA); 
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
    public void perimeterOut() {
        sides.add(0, this.sideA);
        sides.add(1, this.sideB);
        sides.add(2, this.sideA);
        sides.add(3, this.sideB);
        super.perimeterOut();
    }


    @Override
    public void printShapeArea() {
        int area = this.sideA * this.sideB;       
        System.out.printf("Площадь равна %d\n", area);

    }  

}
