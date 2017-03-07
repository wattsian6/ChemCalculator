import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Stack;

/**
 * 
 * @author ???
 * @version ???
 * 
 */
public class ExpressionEvaluator
{

    public static final Pattern UNSIGNED_DOUBLE =
            Pattern.compile("((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
    public static final Pattern CHARACTER = Pattern.compile("\\S.*?");

    /**
     * Takes an infix expression and converts it to postfix.
     * 
     * @param expression
     *            The infix expression.
     * @return the postfix expression.
     */
    public String toPostfix(String expression)
    {
        Stack<Character> stack = new Stack<Character>();
        Scanner input = new Scanner(expression);
        String next;
        char symbol;
        String postfixExpression = "";
        if (expression.contains(") ("))
        {
            input.close();
            throw new IllegalArgumentException("error");
        }
        while (input.hasNext())
        {
            if (input.hasNext(UNSIGNED_DOUBLE))
            {
                next = input.findInLine(UNSIGNED_DOUBLE);
                postfixExpression += " " + next;
            }
            else
            {
                next = input.findInLine(CHARACTER);
                symbol = next.charAt(0);
                if (symbol == '(')
                {
                    stack.push(symbol);
                }
                else if (symbol == '*' || symbol == '+'
                        || symbol == '-' || symbol == '/')
                {
                    while (!stack.isEmpty() && stack.peek() != '(')
                    {
                        if (symbol == '*' || symbol == '/')
                        {
                            if (stack.peek() == '+'
                                    || stack.peek() == '-')
                            {
                                break;
                            }
                        }
                        char temp = stack.pop();
                        postfixExpression += " " + temp;
                    }
                    stack.push(symbol);
                }
                else
                {
                    symbol = next.charAt(0);
                    while (stack.peek() != '(' && !stack.isEmpty())
                    {
                        char temp = stack.pop();
                        postfixExpression += " " + temp;
                    }
                    if (!stack.isEmpty())
                    {
                        stack.pop();
                    }
                }
            }
        }
        while (!stack.isEmpty())
        {
            if (stack.peek() == '*' || stack.peek() == '+'
                    || stack.peek() == '-' || stack.peek() == '/')
            {
                postfixExpression += " " + stack.pop();
            }
            else
            {
                stack.pop();
            }
        }
        input.close();
        return postfixExpression;
    }

    /**
     * Evaluates a postfix expression and returns the result.
     * 
     * @param postfixExpression
     *            The postfix expression.
     * @return The result of the expression.
     */
    public double evaluate(String postfixExpression)
    {
        Stack<Double> stack = new Stack<Double>();
        Scanner input = new Scanner(postfixExpression);
        String next;
        char operator;
        double answer = Double.NaN;

        while (input.hasNext())
        {
            if (input.hasNext(UNSIGNED_DOUBLE))
            {
                next = input.findInLine(UNSIGNED_DOUBLE);
                stack.push(Double.parseDouble(next));
            }
            else
            {
                next = input.findInLine(CHARACTER);
                operator = next.charAt(0);
                Double d1 = stack.pop();
                Double d2 = stack.pop();
                Double d3 = new Double(0);
                if (operator == '*')
                {
                    d3 = d2 * d1;
                }
                else if (operator == '+')
                {
                    d3 = d2 + d1;
                }
                if (operator == '/')
                {
                    if (d1 != 0)
                    {
                        d3 = d2 / d1;
                    }
                    else              	
                    {
                        input.close();
                        throw new IllegalArgumentException("ERROR");

                    }


                }
                if (operator == '-')
                {
                    d3 = d2 - d1;
                }
                stack.push(d3);

            }
        }
        answer = stack.peek();
        input.close();
        return answer;

    }

}
