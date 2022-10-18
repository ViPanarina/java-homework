import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        //задание 1

        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;

        //задание 2

         int intValue1 = 54;
         int intValue2 = 16;

         int sum = intValue1 + intValue2;
         System.out.println("Result of operation is =");
         System.out.println(sum);

         //задание 3

        double resultDevide = 50D / 3D;
        System.out.println(resultDevide);

        //задание 4

        int n = 5;
        int resultMul = n * n;
        System.out.println(resultMul);

        //Second level

        int valueA = 0;
        int valueB = 1;
        int valueC = 2;
        int valueD = 3;
        int valueE = 4;
        int valueF = 5;
        int valueG = 6;
        int valueH = 7;
        int valueI = 8;
        int valueJ = 9;

        int sumOfValues = (valueA+ valueB + valueC + valueD + valueE + valueF + valueG + valueH +valueI + valueJ) / 10 ;
        System.out.println(sumOfValues);
    }
}