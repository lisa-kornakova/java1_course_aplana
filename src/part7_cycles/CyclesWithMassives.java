package fivthTask;
import java.util.Scanner;
public class CyclesWithMassives {
    public static void main(String[] args) {
        final int X = 5;
        final int Y = 7;
        final int Z = 8;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, равное размеру массива");
        int lengthArray = in.nextInt();
        int[] yourArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Введите элемент массива");
            int element = in.nextInt();
            yourArray[i] = element;
            if (yourArray[i] == X) {
                System.out.println("Данное значение имеется в константах");
                continue;
            } else if (yourArray[i] == Y) {
                System.out.println("Данное значение имеется в константах");
                continue;
            } else if (yourArray[i] == Z) {
                System.out.println("Данное значение имеется в константах");
                continue;
            }
        }
    }
}
