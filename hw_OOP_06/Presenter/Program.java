package Presenter;

import Model.ModelRealization;
import View.ViewConsole;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new ModelRealization(), new ViewConsole());
        p.getCalculate();
    }
}
