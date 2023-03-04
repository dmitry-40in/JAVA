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


        Exit way = new Exit();
        way.exitMaping(mapa, rowExit, columnExit, mapa[columnExit][rowExit]);
        mapa[columnCat][rowCat] = 1;
        mapa[columnExit][rowExit] = -3;

        MapPrinter mapaPrint = new MapPrinter();
        System.out.println(mapaPrint.colorMap(mapa));
        mapaPrint.arrayMap(mapa);
        

        System.out.println(mapaPrint.colorMap(mapa));
        // System.out.println(mapa[columnExit][rowExit]);
        // System.out.println(mapa[1][1]);


        //System.out.println(cat.column);

    }
}   
