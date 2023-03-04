public class MapPrinter {

    public StringBuilder colorMap(int[][] map) {
        StringBuilder line = new StringBuilder();
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                switch (map[row][column]) {
                    case -3:
                        line.append("░░░");
                        break;
                    case -2:
                        line.append("▓▓▓");
                        break;
                    case -1:
                        line.append("███");
                        break;
                    case 0:
                        line.append("   ");
                        break;
                    case 1:
                        line.append("  K");
                        break;
                    default:
                        line.append(String.format("%3d", map[row][column]));
                        break;
                }
            }
            line.append("\n");
        }
        return line;
    }

    public void arrayMap(int[][] map) {
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                System.out.printf("%3d ", map[row][column]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
