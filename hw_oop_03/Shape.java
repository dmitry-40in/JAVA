public abstract class Shape implements Comparable<Shape> {
    public abstract String getShapeType(); // это вынести в интерфейс вместе с исклбчениями

    public abstract int getShapePerimeter();

    public abstract int getShapeArea();

    @Override
    public int compareTo(Shape o) {
        if (this.getShapeArea() > o.getShapeArea())
            return 1;
        else if (this.getShapeArea() < o.getShapeArea())
            return -1;
        else
            return 0;
    }

}