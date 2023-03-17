public class Square extends Polygons {
    private int sideA;
    private int sideB;
    private int perimeter;
    private int area;
    int y;

    public Square(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        setSide(this.sideA);
        setSide(this.sideB);
        setSide(this.sideA);
        setSide(this.sideB);
        this.perimeter = perimeterOut();
        this.area = getSide(0) * getSide(1);
    }

    public Square(int sideA) {
        this(sideA, sideA);
    }


    // Выдеить в интерфейс с ифами и кейсами и многоугольник и ограничения исключения можно сразу написать
    @Override
    public String getShapeType() {
        if (this.sideA == this.sideB) {
            return "квадрат";
        } else {
            return "прямоугольник";
        }
    }
    //

    @Override
    public int getShapePerimeter() {
        return this.perimeter;
    }

    @Override
    public int getShapeArea() {
        return this.area;
    }

    // y = (int) (Math.PI * Math.pow(10, 2));
    // int qqq = (int) (Math.PI * Math.pow(10, 2));

}
