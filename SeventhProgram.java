//Display a quick reference table for clerks at a carpet store. The table below lists the
//prices of carpets. The width of a carpet ranges from 11 to 20 ft with an increment of 1
//ft. The length of a carpet ranges from 5 to 25 ft with an increment of 5 ft. The unit
//price of a carpet is Rs. 19 per square foot.

public class SeventhProgram {
    public static void main(String[] args) {
        System.out.println("\t\t"+"5"+"\t\t\t"+"10"+"\t\t\t"+"15"+"\t\t\t"+"20"+"\t\t\t"+"25");
        for (int i = 11 ; i <= 20; i++) {
            System.out.print(i+"\t");
            for (int j = 5; j <=25 ; j+=5) {
                System.out.print("\t"+i*j * 19 + "\t");
            }
            System.out.println();
        }

    }
}
