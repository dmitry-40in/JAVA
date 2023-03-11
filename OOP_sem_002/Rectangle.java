public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    protected Rectangle(int valueA, int valueB) {
        this.sideA = valueA;
        this.sideB = valueB;
    }

    public void setSideA(int value) {
        this.sideA = value;
    }

    public int getSideA() {
        return this.sideA;
    }

    public void setSideB(int value) {
        this.sideB = value;
    }

    public int getSideB() {
        return this.sideB;
    }

    @Override
    public int perimeterShape() {
        return (this.sideA + this.sideB) * 2;
    }

    @Override
    public int squareShape() {
        return this.sideA * this.sideB;
    }

}
