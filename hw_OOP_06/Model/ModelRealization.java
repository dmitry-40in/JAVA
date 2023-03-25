package Model;

import java.util.Stack;

public class ModelRealization extends ModelСalculation {

    public ModelRealization() {

    }

    @Override
    public void setInfixExpression(String inputExpression) {
        super.infixExpression = inputExpression;
    }

    @Override
    public void setPostfixExpression() {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder expressionRPN = new StringBuilder();
        expressionRPN.append("");
        stack.clear();
        for (int i = 0; i < infixExpression.length(); i++) {
            if (infixExpression.charAt(i) == '(') {
                stack.push(infixExpression.charAt(i));
            } else if (infixExpression.charAt(i) == ')') {
                expressionRPN.append(' ');
                while (stack.peek() != '(') {
                    expressionRPN.append(stack.pop());
                }
                stack.pop();
            } else if (infixExpression.charAt(i) == '+' || infixExpression.charAt(i) == '-') {
                expressionRPN.append(' ');
                if (!stack.isEmpty()) {
                    if (stack.peek() == '+' || stack.peek() == '-') {
                        expressionRPN.append(stack.pop());
                        stack.push(infixExpression.charAt(i));
                    } else if (stack.peek() == '*' || stack.peek() == '/') {
                        while (!stack.isEmpty() && stack.peek() != '(') {
                            expressionRPN.append(stack.pop());
                        }
                        stack.push(infixExpression.charAt(i));
                    } else {
                        stack.push(infixExpression.charAt(i));
                    }
                } else {
                    stack.push(infixExpression.charAt(i));
                }
            } else if (infixExpression.charAt(i) == '*' || infixExpression.charAt(i) == '/') {
                expressionRPN.append(' ');
                if (!stack.isEmpty()) {
                    if (stack.peek() == '+' || stack.peek() == '-') {
                        stack.push(infixExpression.charAt(i));
                    } else if (stack.peek() == '*' || stack.peek() == '/') {
                        expressionRPN.append(stack.pop());
                        stack.push(infixExpression.charAt(i));

                    } else {
                        stack.push(infixExpression.charAt(i));
                    }

                } else {
                    stack.push(infixExpression.charAt(i));
                }

            } else {
                expressionRPN.append(infixExpression.charAt(i));
            }
            if (i == infixExpression.length() - 1) {
                while (stack.isEmpty() != true) {
                    expressionRPN.append(stack.pop());
                }
            }
        }
        super.postfixExpression = expressionRPN.toString();
    }

    @Override
    public double result() {
        StringBuilder tmp = new StringBuilder();
        String tmpString = new String();
        Double one = 0.0;
        Double two = 0.0;
        tmp.append("");
        tmpString = "";
        boolean nextFlag = true;
        Stack<Double> resultStack = new Stack<Double>();
        for (int i = 0; i < postfixExpression.length(); i++) {
            if (postfixExpression.charAt(i) == '1' || postfixExpression.charAt(i) == '2'
                    || postfixExpression.charAt(i) == '3' || postfixExpression.charAt(i) == '4'
                    || postfixExpression.charAt(i) == '5' || postfixExpression.charAt(i) == '6'
                    || postfixExpression.charAt(i) == '7'
                    || postfixExpression.charAt(i) == '8' || postfixExpression.charAt(i) == '9'
                    || postfixExpression.charAt(i) == '0'
                    || postfixExpression.charAt(i) == '.') {
                tmp.append(postfixExpression.charAt(i));
                nextFlag = true;
            } else {
                if (nextFlag) {
                    tmpString = tmp.toString();
                    resultStack.push(Double.parseDouble(tmpString));
                    tmp.setLength(0);
                    tmpString = "";
                    nextFlag = false;
                }
                if (postfixExpression.charAt(i) != ' ') {
                    two = resultStack.pop();
                    one = resultStack.pop();
                    if (postfixExpression.charAt(i) == '+') {
                        resultStack.push(one + two);
                    } else if (postfixExpression.charAt(i) == '-') {
                        resultStack.push(one - two);
                    } else if (postfixExpression.charAt(i) == '*') {
                        resultStack.push(one * two);
                    } else {
                        resultStack.push(one / two);
                    }
                }
            }
        }
        return resultStack.pop();
    }

}