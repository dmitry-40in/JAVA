public class Program {

    public static void main(String[] args) {
        int columnCat = 7;
        int rowCat = 6;

        int columnExit = 18;
        int rowExit = 1;

        Point cat = new Point(columnCat, rowCat);
        Point exit = new Point(columnExit, rowExit);
        // как то добавить значение в базовый класс чтобы кат и икзит отличались как 1 и
        // -2

        Maze mazeMap = new Maze();
        int[][] mapa = mazeMap.map;

        MapPrinter mapaPrint = new MapPrinter();
        System.out.println(mapaPrint.colorMap(mapa));

        // как костыль пока значение кота и выхода не придумал в ООП
        // Тут скорее всего как с магам, описать дополнитеьный функционал? или ввести сразу третье значение?
        // и попробовать ИНКАПСУЛЯЦИЮ сделать чтобы только 2 действия сделатть задать котика и выход с печатью карты
        mapa[columnCat][rowCat] = 1;
        
        System.out.println(mapaPrint.colorMap(mapa));
        System.out.println(mapa[columnExit][rowExit]);
        System.out.println(mapa[1][1]);
        /// Я ж еще не замостил волной...

        System.out.println(cat.column);

    }
}   
