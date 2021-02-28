package finalTask;
import java.util.Scanner;
public class MoneyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс:");
        double moneyCourse = in.nextDouble();
        System.out.println("Введите количество рублей:");
        double roubles = in.nextDouble();
        double result = roubles/moneyCourse;
        System.out.printf("Курс доллара: %.2f\n", moneyCourse);
        System.out.printf("Количество рублей: %.2f\n", roubles);
        System.out.printf("Итого: %.2f\n",result);
        }

    }

