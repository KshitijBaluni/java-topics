package programs.math;
/**
 * Calculator
 *
 * @author Shivam
 * @since 20 Dec,2022
 */
import java.util.Scanner;
    public class BasicCalculator

    {
        public static void main(String[] args)
        {
            /**
             * Calculator (Add,Sub,Mul,Div)
             *
             * @param - Add,Sub,Mul,Div
             * @return Calculate the given values
             */
            double num1, num2;

            // Taking input from the user
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter First numbers");
            num1 = sc.nextDouble();
            /**
             * Taking first input from user and save in num1
             *
             * @param- Saving user input in num1
             */
            System.out.println("Enter Second numbers");
            num2 = sc.nextDouble();
            /**
             * Taking second input from user and save in num2
             *
             * @param- Saving user input in num2
             */

            System.out.println("Enter the operator (+,-,*,/)");
            /**
             * choosing operators by user
             *
             */

            char op = sc.next().charAt(0);
            double o = 0;

            switch (op)
            {
                /**
                 * Adding given input by users
                 *
                 * @param- Operator + (plus)
                 */
                case '+':
                    o = num1 + num2;
                    break;

                /**
                 * Subtract given input by users
                 *
                 * @param- Operator - (Subtract)
                 */
                case '-':
                    o = num1 - num2;
                    break;

                /**
                 * Multiply given input by users
                 *
                 * @param- Operator * (Multiply)
                 */
                case '*':
                    o = num1 * num2;
                    break;

                /**
                 * Devision given input by users
                 *
                 * @param- Operator / (Devision)
                 */
                case '/':
                    o = num1 / num2;
                    break;

                default:

                    System.out.println("You enter wrong input");
                    break;
            }

            System.out.println("The final result:");

            System.out.println();

            // print the final result
            System.out.println(num1 + " " + op + " " + num2
                    + " = " + o);
        }
    }



