import java.util.Scanner;

public class switchCase {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter tne number: ");
            int theNumber = input.nextInt();
            switch (theNumber % 2) {
                case 0: {
                    System.out.println(true);
                    break;
                }
                case 1: {
                    System.out.println(false);
                }
            }
        }
}
