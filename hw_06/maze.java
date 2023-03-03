/**
 * maze
 */
public class maze {

    public static void main(String[] args) {
        
    }
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task_005 {
    public static void main(String[] args) {
        int[][] map = mapMaker();
        System.out.println("Лабиринт с начальными значениями:");
        System.out.println(mapPrinting(map));
        System.out.println("Лабиринт:");
        System.out.println(mapColor(map));

        System.out.println();

        int[] startingPoint = startingPointMaker(map);

        mapWaveMaker(map, startingPoint);
        System.out.println("Лабиринт с поиском решения:");
        System.out.println(mapPrinting(map));
        System.out.println();

        System.out.println("Лабиринт. Печать карты:");
        System.out.println(mapColor(map));
        System.out.println();

        System.out.println("Карта выходов:");
        exitMaping(map);
        System.out.println(mapPrinting(map));
        System.out.println();
        
        System.out.println("Карта выходов:");
        exitMaping(map);
        System.out.println(mapColor(map));
        System.out.println();

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

    private static String mapPrinting(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                sb.append(String.format("%3d", map[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static int[] startingPointMaker(int[][] map) {
        System.out.println("Введите координаты начального расположения котика");

        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Столбец номер: ");
        int row = iScanner.nextInt() - 1;

        System.out.printf("Строка номер: ");
        int column = iScanner.nextInt() - 1;

        while (map[column][row] == -1) {
            System.out.println("Котик не может находиться в стене.\nВведите координаты заново.");

            System.out.printf("Столбец номер: ");
            row = iScanner.nextInt() - 1;

            System.out.printf("Строка номер: ");
            column = iScanner.nextInt() - 1;
        }

        iScanner.close();

        int value = 1;

        map[column][row] = value;

        int[] startingPoint = new int[] { value, column, row };

        return startingPoint;
    }

    static void mapWaveMaker(int[][] map, int[] startingPoint) {
        Queue<int[]> queue = new LinkedList<int[]>();

        queue.add(startingPoint);

        while (!queue.isEmpty()) {
            int[] point = queue.remove();
            int valuePoint = point[0];
            int columnPoint = point[1];
            int rowPoint = point[2];

            pointPainter(map, valuePoint, columnPoint - 1, rowPoint, queue);
            pointPainter(map, valuePoint, columnPoint, rowPoint + 1, queue);
            pointPainter(map, valuePoint, columnPoint + 1, rowPoint, queue);
            pointPainter(map, valuePoint, columnPoint, rowPoint - 1, queue);
        }
    }

    private static void pointPainter(int[][] map, int value, int column, int row, Queue<int[]> queue) {
        int[] tmp = new int[3];
        if (map[column][row] == 0) {
            map[column][row] = value + 1;
            tmp[0] = value + 1;
            tmp[1] = column;
            tmp[2] = row;
            queue.add(tmp);
        }
    }

    static String mapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                switch (map[row][col]) {

                    case -1:
                        sb.append("███");
                        break;
                    case 0:
                        sb.append("   ");
                        break;
                    case 1:
                        sb.append("  K");
                        break;
                    default:
                        sb.append(String.format("%3d", map[row][col]));
                        break;
                }
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }

    private static void exitMaping(int[][] map) {
        // координаты выхода пока здесь, чтобы проверить работоспособность метода
        int exitColumn = 1;
        int exitRow = 18;
        int exitValue = 19;
        int[] exit = new int[] {exitValue, exitColumn, exitRow};

        map[exitColumn][exitRow] = -2;  

        
        
        Queue<int[]> data = new LinkedList<int[]>();

        data.add(exit);

        while (!data.isEmpty()) {
            int[] point = data.remove();
            int valuePoint = point[0];
            int columnPoint = point[1];
            int rowPoint = point[2];

            exitPointPainter(map, valuePoint, columnPoint - 1, rowPoint, data);
            exitPointPainter(map, valuePoint, columnPoint, rowPoint + 1, data);
            exitPointPainter(map, valuePoint, columnPoint + 1, rowPoint, data);
            exitPointPainter(map, valuePoint, columnPoint, rowPoint - 1, data);
        }

        // for (int i = 0; i < map.length; i++) {
        //     for (int j = 0; j < map[i].length; j++) {
        //         System.out.printf("%3d", map[i][j]);
        //     }
        //     System.out.println();
        // }

    }

    private static void exitPointPainter(int[][] map, int value, int column, int row, Queue<int[]> data) {
        int[] tmp = new int[3];
        if (map[column][row] != -1 && map[column][row] == value - 1 ) {
            map[column][row] = -2;
            tmp[0] = value - 1;
            tmp[1] = column;
            tmp[2] = row;
            data.add(tmp);
        }
    }
}
