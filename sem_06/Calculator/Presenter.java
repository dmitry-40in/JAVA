package Calculator;


public class Presenter {
    View view;
    Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void clickB() {
        int x = view.getValue("a = ");
        // System.out.println();
        int y = view.getValue("b = ");
        // System.out.println();
        model.setX(x);
        model.setY(y);
        int result = model.result();
        view.print(result, "Sum: ");
        System.out.println();
    }
    
}