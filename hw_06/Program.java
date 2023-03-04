public class Program {
    public static void main(String[] args) {
        int columnCat = 7;
        int rowCat = 6;

        int columnExit = 1;
        int rowExit = 18;

        Point cat = new Point(columnCat, rowCat);
        Point exit = new Point(columnExit, rowExit);

        Maze mazeMap = new Maze();
        int[][] mapa = mazeMap.map;
        mapa[columnCat][rowCat] = 1;

        Wave wave = new Wave();
        wave.mapWaveMaker(mapa, rowCat, columnCat, mapa[columnCat][rowCat]);

        MapPrinter mapaPrint = new MapPrinter();
        System.out.println("Карта лабирианта с котиком, без выхода:");
        mapaPrint.arrayMap(mapa);

        Exit way = new Exit();
        way.exitMaping(mapa, rowExit, columnExit, mapa[columnExit][rowExit]);
        mapa[columnCat][rowCat] = 1;
        mapa[columnExit][rowExit] = -3;

        System.out.println("Карта лабирианта с котиком, выходом и путями одинаковой длины до выхода:");
        System.out.println(mapaPrint.colorMap(mapa));
    }
    
}
