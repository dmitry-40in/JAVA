import java.util.ArrayList;

public abstract class Polygons extends Shape {
    public ArrayList<Integer> sides;

    public Polygons() {
        this.sides = new ArrayList<Integer>();
    }

    public int perimeterOut( ArrayList<Integer> sides) {
        int perimeter = 0;
        for (Integer i : sides) {
            perimeter = perimeter + i;
        }
        return perimeter;
    }
    
}
