package firthTask;

import java.util.Scanner;

public class Operators2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = in.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = in.nextDouble();
        System.out.println("Введите третье число:");
        double num3 = in.nextDouble();
        double srednee = (num1 + num2 + num3) / 3.0;
        System.out.println(srednee);
        double chislo = Math.floor((srednee / 2));
        if (chislo > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
