package finalTask;
import java.util.Scanner;
public class Stroki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = in.nextInt();
        String[] strokiArray = new String[n];
        for (int i = 0; i < strokiArray.length; i++) {
            System.out.println("Введите строку:");
            strokiArray[i] = in.next();
        }
        int max = 0;
        String answer = "";
        for (String stroka : strokiArray) {
            String newStroka = stroka;
            int number = 0;
            while (newStroka.length() != 0) {
                number += 1;
                newStroka = newStroka.replaceAll(Character.toString(newStroka.charAt(0)), "");
            }
            if (number > max) {
                max = number;
                answer = stroka;
            }
        }
        System.out.println(answer);
    }
}

