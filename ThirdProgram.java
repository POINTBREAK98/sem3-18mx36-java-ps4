//Pattern printing

import java.util.Scanner;
public class ThirdProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number of Rows:");
        int n=input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = n; j >= -n; j--)
            {
                if (j == 0 || j==-1) {continue;}
                if (i >= Math.abs(j)) System.out.print(Math.abs(j));
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
