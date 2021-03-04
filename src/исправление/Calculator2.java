package firthTask;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = in.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = in.nextDouble();
        System.out.println("Введите символ операции");
        String oper = in.next();
        switch (oper) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0.0){
                    System.out.println("Нельзя делить на ноль!");
                    break;
                }
                else{
                    System.out.println(num1 / num2);
                }
                break;
        }
    }
}
