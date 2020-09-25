//Take a 9-digit integer and compute the checksum, and print the 10-digit ISBN number.
//The International Standard Book Number (ISBN) is a 10 digit code that uniquely
//specifies a book. The rightmost digit is a checksum digit which can be uniquely
//determined from the other 9 digits from the condition that d1 + 2d2 + 3d3 + ... +
//10d10 must be a multiple of 11 (here di denotes the ith digit from the right). The
//checksum digit d1 can be any value from 0 to 10: the ISBN convention is to use the
//value X to denote 10.

import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String isbn = input.nextLine();
        int mul = 10, sum =  0;
        for (int i = 0; i < isbn.length(); i++) {
            int digit = Integer.parseInt(isbn.substring(i,i+1));
            sum+=(digit * mul);
            mul--;
        }
        System.out.println("The 10th Digit of ISBN number : " + (11 - sum%11));
    }
}
