import java.util.LinkedList;
import java.util.Queue;

public class task_005 {
    public static void main(String[] args) {

        int[][] m = mapMaker();
        mapPrinting(m);
        System.out.println();

        int[] y = startingPointMaker(m);
        mapPrinting(m);
        System.out.println();

        mapPrinting(mapWaveMaker(m));
        
    }

    private static int[][] mapMaker() {
        int[][] map = {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, -1, -1, -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, -1, -1, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, -1, -1, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, -1, 00, 00, -1, -1, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };
        return map;
    }

    private static void mapPrinting(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%2d  ", map[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] startingPointMaker(int[][] map) {
        System.out.println("Введите координаты начального расположения котика:");
        // Введение координат с клавиатуры
        
        int column = 6;
        int row = 5;

        map[column][row] = 1;
        int[] startingPoint = new int[] {map[column][row], column, row};


        for (int i : startingPoint) {
            System.out.println(i);
        }
        

        return startingPoint;
    }

    private static int[][] mapWaveMaker(int [][] map) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(startingPointMaker(map));

        //queue.element();
        System.out.println();
        for (int i : queue.element()) {
            System.out.println(i);
        }
        


        while (!queue.isEmpty()) { //queue != null !queue.isEmpty()
            int[] point = queue.remove();
            int valuePoint = point[0];
            int columnPoint = point[1];
            int rowPoint = point[2];
            int[] addQueue = new int[3];

            if (map[columnPoint + 1][rowPoint] == 0) {
                map[columnPoint + 1][rowPoint] = valuePoint + 1;
                addQueue[0] = map[columnPoint + 1][rowPoint];
                addQueue[1] = columnPoint + 1;
                addQueue[2] = rowPoint;
                queue.add(addQueue);
            }

            if (map[columnPoint][rowPoint + 1] == 0) {
                map[columnPoint][rowPoint + 1] = valuePoint + 1;
                addQueue[0] = map[columnPoint][rowPoint + 1];
                addQueue[1] = columnPoint;
                addQueue[2] = rowPoint + 1;
                queue.add(addQueue);
            }

            if (map[columnPoint - 1][rowPoint] == 0) {
                map[columnPoint - 1][rowPoint] = valuePoint;
                addQueue[0] = map[columnPoint - 1][rowPoint];
                addQueue[1] = columnPoint - 1;
                addQueue[2] = rowPoint;
                queue.add(addQueue);
            }

            if (map[columnPoint][rowPoint - 1] == 0) {
                map[columnPoint][rowPoint - 1] = valuePoint;
                addQueue[0] = map[columnPoint][rowPoint - 1];
                addQueue[1] = columnPoint;
                addQueue[2] = rowPoint - 1;
                queue.add(addQueue);
            }  
        }
        return map;
    }
}