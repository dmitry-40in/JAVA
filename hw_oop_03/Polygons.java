import java.util.ArrayList;

public abstract class Polygons extends Shape {
    private ArrayList<Integer> sides;

    public Polygons() {
        this.sides = new ArrayList<Integer>();
    }

    public void setSide(int side) {
        this.sides.add(side);
    }

    public int getSide(int i) {
        return sides.get(i);
    }

    public int perimeterOut() {
        int perimeter = 0;
        for (Integer i : sides) {
            perimeter = perimeter + i;
        }
        return perimeter;
    }

}
