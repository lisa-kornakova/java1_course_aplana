package firthTask;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = in.nextInt();
        System.out.println("Введите второе число:");
        int num2 = in.nextInt();
        System.out.println("Введите символ операции");
        String oper = in.next();
        switch(oper) {
            case "+": System.out.println(num1+num2);
            break;
            case "-": System.out.println(num1-num2);
            break;
            case "*": System.out.println(num1*num2);
            break;
            case "/": System.out.println(num1/num2);
            break;
        }


    }
}
