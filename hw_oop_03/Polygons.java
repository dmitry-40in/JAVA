import java.util.ArrayList;

public abstract class Polygons extends Shapes{
    public ArrayList<Integer> sides;

    public Polygons() {
        this.sides = new ArrayList<Integer>();
    }

    public void perimeterOut( ) {
        int perimetr = 0;
        for (Integer i : sides) {
            perimetr = perimetr + i;
        }
        System.out.printf("Периметр равен %d\n", perimetr);
    }
    
}
