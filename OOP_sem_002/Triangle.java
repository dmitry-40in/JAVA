public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }



    @Override
    public int perimeterShape() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeterShape'");
    }

    @Override
    public int squareShape() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'squareShape'");
    }

}