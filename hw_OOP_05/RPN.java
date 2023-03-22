import java.util.Stack;

public class RPN {
    public RPN() {
    }

    public String getRPN(String inputExpression) {

        Stack<Character> stack = new Stack<Character>();
        StringBuilder expressionRPN = new StringBuilder();

        expressionRPN.append("");
        stack.clear();

        for (int i = 0; i < inputExpression.length(); i++) {
            if (inputExpression.charAt(i) == '(') {
                stack.push(inputExpression.charAt(i));
            } else if (inputExpression.charAt(i) == ')') {
                expressionRPN.append(' ');
                while (stack.peek() != '(') {
                    expressionRPN.append(stack.pop());
                }
                stack.pop();
            } else if (inputExpression.charAt(i) == '+' || inputExpression.charAt(i) == '-') {
                expressionRPN.append(' ');
                if (!stack.isEmpty()) {
                    if (stack.peek() == '+' || stack.peek() == '-') {
                        expressionRPN.append(stack.pop());
                        stack.push(inputExpression.charAt(i));
                    } else if (stack.peek() == '*' || stack.peek() == '/') {
                        while (!stack.isEmpty() && stack.peek() != '(') {
                            expressionRPN.append(stack.pop());
                        }
                        stack.push(inputExpression.charAt(i));
                    } else {
                        stack.push(inputExpression.charAt(i));
                    }
                } else {
                    stack.push(inputExpression.charAt(i));
                }
            } else if (inputExpression.charAt(i) == '*' || inputExpression.charAt(i) == '/') {
                expressionRPN.append(' ');
                if (!stack.isEmpty()) {
                    if (stack.peek() == '+' || stack.peek() == '-') {
                        stack.push(inputExpression.charAt(i));
                    } else if (stack.peek() == '*' || stack.peek() == '/') {
                        expressionRPN.append(stack.pop());
                        stack.push(inputExpression.charAt(i));

                    } else {
                        stack.push(inputExpression.charAt(i));
                    }

                } else {
                    stack.push(inputExpression.charAt(i));
                }

            } else {
                expressionRPN.append(inputExpression.charAt(i));
            }

            if (i == inputExpression.length() - 1) {
                while (stack.isEmpty() != true) {
                    expressionRPN.append(stack.pop());
                }
            }
        }

        // System.out.println(inputExpression);
        // System.out.println(stack);
        // System.out.println(expressionRPN);
        // System.out.println();

        return expressionRPN.toString();
    }

    public Double getResult(String expRPN) {
        Double result = 0.0;
        StringBuilder tmp = new StringBuilder();
        String tmpString = new String();
        Double one = 0.0;
        Double two = 0.0;

        tmp.append("");
        tmpString = "";
        boolean nextFlag = true;

        Stack<Double> resultStack = new Stack<Double>();

        for (int i = 0; i < expRPN.length(); i++) {
            if (expRPN.charAt(i) == '1' || expRPN.charAt(i) == '2' || expRPN.charAt(i) == '3' || expRPN.charAt(i) == '4'
                    || expRPN.charAt(i) == '5' || expRPN.charAt(i) == '6' || expRPN.charAt(i) == '7'
                    || expRPN.charAt(i) == '8' || expRPN.charAt(i) == '9' || expRPN.charAt(i) == '0'
                    || expRPN.charAt(i) == '.') {
                tmp.append(expRPN.charAt(i));
                nextFlag = true;
            } else {
                if (nextFlag) {
                    tmpString = tmp.toString();
                    resultStack.push(Double.parseDouble(tmpString));
                    tmp.setLength(0);
                    tmpString = "";

                    nextFlag = false;

                    // System.out.println(resultStack);
                }
                if (expRPN.charAt(i) != ' ') {
                    two = resultStack.pop();
                    one = resultStack.pop();
                    if (expRPN.charAt(i) == '+') {
                        resultStack.push(one + two);
                    } else if (expRPN.charAt(i) == '-') {
                        resultStack.push(one - two);
                    } else if (expRPN.charAt(i) == '*') {
                        resultStack.push(one * two);
                    } else {
                        resultStack.push(one / two);
                    }
                }
            }
        }
        result = resultStack.pop();
        return result;
    }
}
