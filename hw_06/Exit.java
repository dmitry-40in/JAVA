import java.util.LinkedList;
import java.util.Queue;

public class Exit {

    public void exitMaping(int[][] map, int exitRow, int exitColumn, int exitValue) {

        int[] exit = new int[] { exitValue, exitColumn, exitRow };

        map[exitColumn][exitRow] = -2;

        Queue<int[]> data = new LinkedList<int[]>();

        data.add(exit);

        while (!data.isEmpty()) {
            int[] point = data.remove();
            int valuePoint = point[0];
            int columnPoint = point[1];
            int rowPoint = point[2];
            int[] tmp = new int[3];
            
            if (map[columnPoint - 1][rowPoint] != -1 && map[columnPoint - 1][rowPoint] == valuePoint - 1) {
                tmp[0] = valuePoint - 1;
                // System.out.println(tmp[0]);
                tmp[1] = columnPoint - 1;
                tmp[2] = rowPoint;
                data.add(tmp);
                map[columnPoint - 1][rowPoint] = -2;
                // continue;
            }

            if (map[columnPoint][rowPoint + 1] != -1 && map[columnPoint][rowPoint + 1] == valuePoint - 1) {
                tmp[0] = valuePoint - 1;
                // System.out.println(tmp[0]);
                tmp[1] = columnPoint;
                tmp[2] = rowPoint + 1;
                data.add(tmp);
                map[columnPoint][rowPoint + 1] = -2;
                continue;
            }

            if (map[columnPoint + 1][rowPoint] != -1 && map[columnPoint + 1][rowPoint] == valuePoint - 1) {
                tmp[0] = valuePoint - 1;
                // System.out.println(tmp[0]);
                tmp[1] = columnPoint + 1;
                tmp[2] = rowPoint;
                data.add(tmp);
                map[columnPoint + 1][rowPoint] = -2;
                continue;
            }

            if (map[columnPoint][rowPoint - 1] != -1 && map[columnPoint][rowPoint - 1] == valuePoint - 1) {
                tmp[0] = valuePoint - 1;
                // System.out.println(tmp[0]);
                tmp[1] = columnPoint;
                tmp[2] = rowPoint - 1;
                data.add(tmp);
                map[columnPoint][rowPoint - 1] = -2;
                // continue;
            }
            // exitPointPainter(map, valuePoint, columnPoint - 1, rowPoint, data);
            // exitPointPainter(map, valuePoint, columnPoint, rowPoint + 1, data);
            // exitPointPainter(map, valuePoint, columnPoint + 1, rowPoint, data);
            // exitPointPainter(map, valuePoint, columnPoint, rowPoint - 1, data);
        }

    }

    // private void exitPointPainter(int[][] map, int value, int column, int row, Queue<int[]> data) {
    //     int[] tmp = new int[3];
    //     if (map[column][row] != -1 && map[column][row] == value - 1) {
    //         map[column][row] = -2;
    //         tmp[0] = value - 1;
    //         tmp[1] = column;
    //         tmp[2] = row;
    //         data.add(tmp);
    //     }
    // }
    
}
