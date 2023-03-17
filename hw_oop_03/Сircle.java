public class Сircle extends Shape implements CircumferenceLength {
    private int radius;
    

    public Сircle(int radius) {
        this.radius = radius;
    }

    
    // private int length = (int)(2 * Math.PI * this.radius);

    // @Override
    // public int getLength() {
    //     return this.length;
    // }

 
    @Override
    public int getLength() {
        return (int)(2 * Math.PI * this.radius);
    }

    @Override
    public String getShapeType() {
        // в интерфейсе описать
        return "null";
    }
    
    @Override
    public int getShapePerimeter() {
        return -1; // если меньше нуля, то периметра нет
    }

    // private int area = (int) (Math.PI * Math.pow(this.radius, 2));
    
    @Override
    public int getShapeArea() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }
    
}