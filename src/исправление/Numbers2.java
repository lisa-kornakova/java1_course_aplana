package sixthTask;

import java.util.Scanner;

public class Numbers2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String num1 = in.nextLine();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        double numToStr = Double.parseDouble(num1);
        double max = Math.max(numToStr, num2);
        double min = Math.min(numToStr, num2);
        System.out.println(max);
        System.out.println(min);
    }
}
