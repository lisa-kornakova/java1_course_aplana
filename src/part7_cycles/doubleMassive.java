package fivthTask;
import java.util.Scanner;
public class doubleMassive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, равное размеру массива");
        int lengthArray = in.nextInt();
        double sum = 0.0;
        double[] yourArray = new double[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Введите элемент массива");
            double element = in.nextDouble();
            yourArray[i] = element;
            sum = sum + yourArray[i];
        }
        double srednee = sum/lengthArray;
        for (int i = 0; i < lengthArray; i++) {
            System.out.print(yourArray[i]*srednee + " ");
        }
    }
}
