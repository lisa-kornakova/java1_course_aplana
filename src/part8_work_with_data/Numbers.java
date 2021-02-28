package sixthTask;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String num1 = in.nextLine();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        int numToStr = Integer.parseInt(num1);
        int max = Math.max(numToStr, num2);
        int min = Math.min(numToStr, num2);
        double newMin = min;
        System.out.println(max);
        System.out.println(newMin);
    }
}
