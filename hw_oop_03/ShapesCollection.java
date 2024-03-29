import java.util.ArrayList;
import java.util.Collections;

public class ShapesCollection {
    private ArrayList<Shape> shapeCollection;

    public ShapesCollection() {
        shapeCollection = new ArrayList<Shape>();
    }

    public void addShape(Shape shape) {
        this.shapeCollection.add(shape);
    }

    public void removeShape(int index) {
        this.shapeCollection.remove(index - 1);
    }

    public void printInfoOfShapes() {
        for (int i = 0; i < shapeCollection.size(); i++) {
            if (shapeCollection.get(i) instanceof Сircle) {
                Сircle shape = (Сircle) shapeCollection.get(i);
                System.out.printf("%d. Фигура \"%s\", S (площадь) = %d, L (длина окружности) = %d.\n", i + 1,
                        shape.getShapeType(),
                        shape.getShapeArea(), shape.getLength());
            } else {
                System.out.printf("%d. Фигура \"%s\", S (площадь) = %d, P (периметр) = %d.\n", i + 1,
                        shapeCollection.get(i).getShapeType(), shapeCollection.get(i).getShapeArea(),
                        shapeCollection.get(i).getShapePerimeter());
            }

        }
        System.out.println();

    }

    public void sort() {
        Collections.sort(this.shapeCollection);
    }

    // changeShapeByIndex
    // public Shape getShape(int) {
    // return
    // }
    // addShape
    // removeShape
    // printInfoOfShapes
    // changeShapeByIndex
    // SortByArea

    // public

}
