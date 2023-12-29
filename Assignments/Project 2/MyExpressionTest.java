/* Ethan Leonard
 * 202435864
 * 11/9/23
 * This program takes an expression as input, checks to make sure it is valid,
 * sends the input off to a infix to postfix converter and then to a postfix
 * evaluator. Finally, evaluation is sent back to the user. 
 */


import java.util.*;

public class MyExpressionTest {
    // declarations
    static Scanner input = new Scanner(System.in);
    static String infix;
    static String postfix;
    
    public static void main(String[] args) {

        // forever
        while (true) {
            // Print out prompt for user and get their answer
            System.out.print("CS211. Fall Quarter 2023");
            System.out.printf("\nEnter a math expression: ");
            String mathExpression=input.nextLine();

            // if user inputs nothing exit program
            if (mathExpression.length()==0) {
                System.out.printf("\nBye!");
                break;
            }

            // else 
            else {
                // evaluate the validty of the expression
                ExpressionEvaluation ee = new ExpressionEvaluation();
                boolean valid = ee.expressionEvaluation(mathExpression);

                    // if expression is valid, get postfix and find value
                    if (valid) {
                        System.out.println("infix: " + mathExpression);
                        InfixToPostfix i2p = new InfixToPostfix();    
                        String postfix = i2p.infix2postfix(mathExpression);
                        System.out.println("postfix: " + postfix);

                        PostfixEvaluation pe = new PostfixEvaluation();
                        int result = pe.postfixEvaluation(postfix);
                        System.out.println("result: " + result);
                        System.out.println();
                    }
            }
        } 
    } 
}
