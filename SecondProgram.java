//Enter the numbers till the user wants and at the end it should display the count of
//positive, negative and zeros entered.

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        int cc ;
        int x, positive = 0, negative = 0, zeroes = 0;
        Scanner input = new Scanner(System.in);
        do {
            x = input.nextInt();
            if(x > 0)
                positive++;
            if(x < 0)
                negative++;
            if(x == 0)
                zeroes++;
            System.out.println("TO CONTINUE ENTER 1");
            cc = input.nextInt();
        }while(cc!=0);
        System.out.println("Positive : " + positive);
        System.out.println("Negative : " + negative);
        System.out.println("Zeroes : " + zeroes);
    }
}
