package fivthTask;
import java.util.Scanner;
public class Matrica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк в матрице");
        int stroki = in.nextInt();
        System.out.println("Введите число столбцов в матрице");
        int stolbcy = in.nextInt();
        int[][] matrArray = new int[stroki][stolbcy];
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbcy; j++) {
                System.out.println("Введите элемент матрицы");
                matrArray[i][j] = in.nextInt();
            }
        }
        for (int j = 0; j < stolbcy; j++) {
            System.out.print(matrArray[0][j]*3 + " ");
        }
    }
}
