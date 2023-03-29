class ViewConsole : ViewAbstrct
{

    override
    public string getInfixExpression() 
    {
        Console.Write("Введите выражение без пробелов: ");
        string? expression = Console.ReadLine();
        return expression;
    }

    override
    public void resultV(double result) 
    {
        Console.WriteLine($"result = {result}");
    }

}
