package Calculator;


public class Program {

    public static void main(String[] args) {

        Model m = new SumModel();
        View v = new View();

        Presenter p = new Presenter(v, m);

        p.clickB();
    }
}