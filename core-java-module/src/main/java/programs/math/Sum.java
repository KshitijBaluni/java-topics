package programs.math;

import java.util.Scanner;

public class Sum {    // Class name Sum
    public static void main(String[] args)
    {
       //  System.out.println("Taking input from the user");

        Scanner sc = new Scanner(System.in);   // Object

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int sum=a+b;
        System.out.println("The Output is  " + sum);
    }

}
