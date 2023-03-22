import java.util.Stack;

public class Program {
    public static void main(String[] args) {

        String input = "(1+2*(3+4*(5-6)))/(7-8-9)+10";
        System.out.println(input);

        Stack<Character> stack = new Stack<Character>();
        StringBuilder expression = new StringBuilder();
     
        expression.append("");
        stack.clear();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else if (input.charAt(i) == ')') {
                while (stack.peek() != '(') {
                    expression.append(stack.pop());
                }
                stack.pop();
            } else if (input.charAt(i) == '+' || input.charAt(i) == '-') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '+' || stack.peek() == '-') {
                        expression.append(stack.pop());
                        stack.push(input.charAt(i));
                    } else if (stack.peek() == '*' || stack.peek() == '/') {
                        while (!stack.isEmpty() && stack.peek() != '(') {
                            expression.append(stack.pop());
                        }
                        stack.push(input.charAt(i));
                    } else {
                        stack.push(input.charAt(i));
                    }
                } else {
                    stack.push(input.charAt(i));
                }
            } else if (input.charAt(i) == '*' || input.charAt(i) == '/') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '+' || stack.peek() == '-') {
                        stack.push(input.charAt(i));
                    } else if (stack.peek() == '*' || stack.peek() == '/') {
                        expression.append(stack.pop());
                        stack.push(input.charAt(i));

                    } else {
                        stack.push(input.charAt(i));
                    }

                } else {
                    stack.push(input.charAt(i));
                }

            } else {
                expression.append(input.charAt(i));
            }

            if (i == input.length() - 1) {
                while (stack.isEmpty() != true) {
                    expression.append(stack.pop());
                }
            }
        }

        System.out.println(stack);
        System.out.println(expression);

    }

}