public class Presenter 
{
    private ModelRPN m;
    private ViewRealization v;

    public Presenter(ModelRPN m, ViewRealization v) 
    {
        this.m = m;
        this.v = v;
    }

    private void setInfixExp() 
    {
        string exp = v.getInfixExpression();
        m.setInfixExpression(exp);
    }

    private void calculateExp() 
    {
        m.setPostfixExpression();
        v.resultV(m.result());
    }

    public void getCalculate() 
    {
        setInfixExp();
        calculateExp();
    }
}