//Calculate the monthly telephone bills as per the following rules:
// Minimum Rs. 200 for up to 100 calls.
// Plus Rs. 0.60 per call for next 50 calls.
// Plus Rs. 0.50 per call for next 50 calls.
// Plus Rs. 0.40 per call for any call beyond 200 calls.
import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of calls : ");
        int calls = input.nextInt();
        float amount = 200;
        if(calls <= 100)
            System.out.println("Amount :" + amount );
        else if(calls>100 && calls<=150)
        {
            amount += (calls-100)*0.60;
        }
        else if(calls>150 && calls<=200)
        {
            amount+= (50)*0.60 + (calls-150) * 0.50;
        }
        else
            amount+= (50)*0.60 + (50)*0.50 + (calls - 200) *0.40;
        System.out.println("Amount : " + amount);
    }
}
