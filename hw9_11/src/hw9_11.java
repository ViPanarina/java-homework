import java.util.Arrays;

public class hw9_11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countLetter("мишка косолапый по лесу идёт шишки собирает песенки поёт")));
        //System.out.println(Arrays.toString(countWorks("мишка косолапый по лесу идёт шишки собирает песенки поёт")));

        System.out.println(reverseString("Привет, Максим"));
    }

    /*
    public static Object[] countWorks(String text) {
        String[] arraysText = text.split(" ");
        return Arrays.stream(arraysText).filter(w -> w.length() >= 7).map(word -> {
            int wordLength = word.length();
            return word.substring(0,1).toUpperCase() + word.substring(1, wordLength - 1) + word.substring(wordLength - 1, wordLength).toUpperCase();
        }).toArray();
    }

     */
// 1 task
    public static String[] countLetter(String text) {
        String[] arraysText = text.split(" ");

        int count = 0;
        for (int index = 0; index < arraysText.length; index++) {
            if(arraysText[index].length()>=7) {
                count ++;
            }
        }

        if(count == 0) {
            return new String[0];
        }
        String[] arrayWords = new String[count];
        int secondIndex = 0;
        for (int index = 0; index < arraysText.length; index++) {
            if(arraysText[index].length()>=7) {
                String word = arraysText[index];
                int wordLength  = word.length();
                arrayWords[secondIndex] = word.substring(0,1).toUpperCase() + word.substring(1, wordLength - 1) + word.substring(wordLength - 1, wordLength).toUpperCase();
                secondIndex ++;
            }
        }

        return arrayWords;
    }

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        for (int index = 0; index < str.length()/2; index++) {
            char temp = array[index];
            array[index] = array[str.length()-index-1];
            array[str.length()-index-1] = temp;
        }
        return new String(array);
    }
}
