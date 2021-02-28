package fivthTask;
import java.util.Scanner;
public class FindSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int n = in.nextInt();
        int begunok = 1;
        int sum = 0;
        while(begunok < n){
            sum = sum + begunok;
            begunok = begunok + 2;
        }
        if (!(n%2 == 0)){
            sum = sum + n;
        }
        System.out.printf("Сумма всех нечетных чисел до n = %d", sum);
    }
}