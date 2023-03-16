public class Сircle extends Shape implements CircumferenceLength {
    private int radius;

    public Сircle(int radius) {
        this.radius = radius;
    }

    @Override
    public void shapeType() {
        System.out.printf("Эта фигура - окружность.\n");
    }

    //
    @Override
    public void printShapePerimeter() {
        System.out.printf("У окружности нет периметра\n");
        
    }

    private int area = (int) (Math.PI * Math.pow(radius, 2));
    public int getArea() {
        return this.area;
    }

    @Override
    public void printShapeArea() {
        System.out.printf("Площадь равна %d\n", this.area);
    }


    private int length = (int) (2 * Math.PI * radius);
    public int getLength() {
        return this.length;
    }

    @Override
    public void printLength() {
        System.out.printf("Длина окружности равна %d\n", this.length);
    }
    
}