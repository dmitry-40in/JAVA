public class Program {
    public static void main(String[] args) {
        
        // BuilderArrayList<String> x = new BuilderArrayList<String>();
        
        
        // Cat[] arr = new Cat[]{new Cat("a", 1), new Cat("b", 2), new Cat("c", 3)};

        BuilderArrayList<Cat> x = new BuilderArrayList<Cat>();
        
        // System.out.println(x);

        // x.addData(555);
        x.addData(new Cat("q", 100));
        x.addData(new Cat("v", 110));
        x.addData(new Cat("d", 120));
        x.addData(new Cat("a", 200));
        x.addData(new Cat("t", 300));
        x.addData(new Cat("i", 500));
        x.addData(new Cat("p", 1000));
        x.addData(new Cat("w", 1200));
        x.addData(new Cat("z", 10000));

        // x.addData("new Cat(, 100)");
        // x.addData("new Cat(, 110)");
        // x.addData("new Cat(, 120)");
        // x.addData("new Cat(, 200)");
        // x.addData("new Cat(, 300)");
        // x.addData("new Cat(, 500)");
        // x.addData("new Cat(, 1000)");
        // x.addData("new Cat(, 1200)");
        // x.addData("new Cat(, 10000)");

        x.printData();
        System.out.println();

        x.removeElementIndex(1);
        x.printData();

        // System.out.println();
        // x.removeElementsData("w");
        // x.printData();
        
        System.out.println();
        x.getElement(x, 0)
    }
    
}