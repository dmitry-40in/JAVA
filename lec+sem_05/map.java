/**
 * map
 */
public class map {
    public static void main(String[] args) {

        int[][] m = mapMaking();
        mapPrinting(m);
    }

    private static int[][] mapMaking() {
        int[][] map = { { 0, 0, 0, 0 }, { 0, -1, 0, 0 }, { 0, -1, 0, 0 }, { 0, 0, 0, 0 } };
        
        return map;
    }

    private static void mapPrinting(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%d  ", map[i][j]);
            }
            System.out.println();
        }
    }
}