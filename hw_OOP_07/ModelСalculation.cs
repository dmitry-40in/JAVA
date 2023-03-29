abstract class ModelСalculation : ModelRPN
{

    public string infixExpression = "";
    public string postfixExpression = "";

    public abstract double result();
    public abstract void setInfixExpression(string input);
    public abstract void setPostfixExpression();
}