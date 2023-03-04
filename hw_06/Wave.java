import java.util.LinkedList;
import java.util.Queue;

public class Wave {

    public void mapWaveMaker(int[][] map, int rowValue, int columnValue, int cellPoint) {
        int[] startingPoint = new int[]{cellPoint, columnValue, rowValue}; // Как значение котика и выхода использовать в одном файле

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

    private void pointPainter(int[][] map, int value, int column, int row, Queue<int[]> queue) {
        int[] tmp = new int[3];
        if (map[column][row] == 0) {
            map[column][row] = value + 1;
            tmp[0] = value + 1;
            tmp[1] = column;
            tmp[2] = row;
            queue.add(tmp);
        }
    }
    
}
