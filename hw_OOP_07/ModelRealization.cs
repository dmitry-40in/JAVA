class ModelRealization : ModelСalculation {

    public ModelRealization() {

    }

    override
    public void setInfixExpression(String inputExpression) {
        base.infixExpression = inputExpression;
    }

    override
    public void setPostfixExpression() 
    {
        Stack<char> stack = new Stack<char>();
        string expressionRPN = "";
        stack.Clear();
        for (int i = 0; i < infixExpression.Length; i++) 
        {
            if (infixExpression[i] == '(') 
            {
                stack.Push(infixExpression[i]);
            } 
            else if (infixExpression[i] == ')') 
            {
                expressionRPN += ' ';
                while (stack.Peek() != '(') {
                    expressionRPN += stack.Pop();
                }
                stack.Pop();
            } 
            else if (infixExpression[i] == '+' || infixExpression[i] == '-') 
            {
                expressionRPN += ' ';
                if (stack.Count != 0) 
                {
                    if (stack.Peek() == '+' || stack.Peek() == '-') 
                    {
                        expressionRPN += stack.Pop();
                        stack.Push(infixExpression[i]);
                    } 
                    else if (stack.Peek() == '*' || stack.Peek() == '/') 
                    {
                        while (stack.Count != 0 && stack.Peek() != '(') 
                        {
                            expressionRPN += stack.Pop();
                        }
                        stack.Push(infixExpression[i]);
                    } 
                    else 
                    {
                        stack.Push(infixExpression[i]);
                    }
                } 
                else 
                {
                    stack.Push(infixExpression[i]);
                }
            } 
            else if (infixExpression[i] == '*' || infixExpression[i] == '/') 
            {
                expressionRPN += ' ';
                if (stack.Count != 0) 
                {
                    if (stack.Peek() == '+' || stack.Peek() == '-') 
                    {
                        stack.Push(infixExpression[i]);
                    } 
                    else if (stack.Peek() == '*' || stack.Peek() == '/') 
                    {
                        expressionRPN += stack.Pop();
                        stack.Push(infixExpression[i]);

                    } 
                    else 
                    {
                        stack.Push(infixExpression[i]);
                    }

                } 
                else 
                {
                    stack.Push(infixExpression[i]);
                }

            } 
            else 
            {
                expressionRPN += infixExpression[i];
            }
            if (i == infixExpression.Length - 1) {
                while (stack.Count != 0) 
                {
                    expressionRPN += stack.Pop();
                }
            }
        }
        base.postfixExpression = expressionRPN;
    }

    override
    public double result() {
        string tmp = "";
        Double one = 0.0;
        Double two = 0.0;
        string tmpString = "";
        bool nextFlag = true;
        Stack<double> resultStack = new Stack<double>();
        for (int i = 0; i < postfixExpression.Length; i++) 
        {
            if (postfixExpression[i] == '1' || postfixExpression[i] == '2'
                    || postfixExpression[i] == '3' || postfixExpression[i] == '4'
                    || postfixExpression[i] == '5' || postfixExpression[i] == '6'
                    || postfixExpression[i] == '7'
                    || postfixExpression[i] == '8' || postfixExpression[i] == '9'
                    || postfixExpression[i] == '0'
                    || postfixExpression[i] == '.') 
                    {
                tmp += postfixExpression[i];
                nextFlag = true;
            } 
            else 
            {
                if (nextFlag) 
                {
                    tmpString = tmp;
                    resultStack.Push(double.Parse(tmpString));
                    tmp = "";
                    tmpString = "";
                    nextFlag = false;
                }
                if (postfixExpression[i] != ' ') 
                {
                    two = resultStack.Pop();
                    one = resultStack.Pop();
                    if (postfixExpression[i] == '+') 
                    {
                        resultStack.Push(one + two);
                    } 
                    else if (postfixExpression[i] == '-') 
                    {
                        resultStack.Push(one - two);
                    } 
                    else if (postfixExpression[i] == '*') 
                    {
                        resultStack.Push(one * two);
                    } 
                    else 
                    {
                        resultStack.Push(one / two);
                    }
                }
            }
        }
        return resultStack.Pop();
    }

}