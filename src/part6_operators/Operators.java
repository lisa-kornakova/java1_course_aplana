package firthTask;

import java.util.Scanner;

    public class Operators {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число:");
            int num1 = in.nextInt();
            System.out.println("Введите второе число:");
            int num2 = in.nextInt();
            System.out.println("Введите третье число:");
            int num3 = in.nextInt();
            double srednee = (num1 + num2 + num3) / 3.0;
            System.out.println(srednee);
            int chislo = (int) ((srednee) / 2);
            if (chislo > 3) {
                System.out.println("Программа выполнена корректно");
            }
        }
    }