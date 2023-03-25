package Calculator;

public class SumModel extends CalcModel {

    public SumModel() {
        
    }

    @Override
    public int result() {
        return a + b;
    }

    @Override
    public void setX(int value) {
        super.a = value;
    }

    @Override
    public void setY(int value) {
        super.b = value;
    }
    
}
