import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = input.nextInt();
        System.out.println("a\tb\tpow(a,b)");
        for (int i = 1; i <=a ; i++) {
            System.out.println(i+"\t"+(i+1)+"\t"+(int)Math.pow(i,i+1));
        }
    }
}
