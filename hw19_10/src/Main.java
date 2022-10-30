import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 задание
        Scanner hand = new Scanner(System.in);

        System.out.println("Enter the number for check:");
        int value_1 = hand.nextInt();
        int value_2 = hand.nextInt();
        int delta_1 = 10 - value_1;
        if (delta_1 < 0) {
            delta_1 = - delta_1;
        }
        int delta_2 = 10 - value_2;
        if (delta_2 < 0) {
            delta_2 = - delta_2;
        }
        if (delta_1 < delta_2) {
          System.out.println(value_1 + "closer to 10");
        } else {
            System.out.println(value_2 + "closer to 10");
        }

    }


}

