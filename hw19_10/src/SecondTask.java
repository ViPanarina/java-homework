import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
    //2 задание
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tne number: ");
        int theNumber = input.nextInt();

        if (theNumber % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
