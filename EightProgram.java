//Accept a positive integer and determine whether the number is perfect. Also, display
//all proper divisors of the number.
//A perfect number is a positive integer that is equal to the sum of its proper divisors. A
//proper divisor is a positive integer other than the number itself that divides the
//number evenly (i.e., no remainder). For example, 6 is a perfect number because the
//sum of its proper divisors 1, 2, and 3 is equal to 6.

import java.util.Scanner;

public class EightProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int x = input.nextInt();
        int sum = 0;
        for (int i = 1; i < x ; i++) {
            if(x%i == 0) {
                sum += i;
            }
        }
        if(sum == x)
        {
            System.out.println(x + " is a perfect number");
            System.out.println("The divisors are : ");
            for (int i = 1; i < x ; i++) {
                if(x%i == 0) {
                    System.out.println(i);
                }
            }
        }
        else
            System.out.println("The given number is not a perfect number");
    }
}
