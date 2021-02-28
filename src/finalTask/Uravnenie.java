package finalTask;
import java.util.Scanner;
public class Uravnenie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение");
        String puzzle = in.nextLine();
        char oper = puzzle.charAt(1);
        int answer = 0;
        if (puzzle.charAt(0) == 'x') {
            switch (oper) {
                case '+':
                    int slag = Character.getNumericValue(puzzle.charAt(2));
                    int sum = Character.getNumericValue(puzzle.charAt(4));
                    answer = sum - slag;
                    System.out.println("Ответ: " + answer);
                    break;
                case '-':
                    int vych = Character.getNumericValue(puzzle.charAt(2));
                    int razn = Character.getNumericValue(puzzle.charAt(4));
                    answer = vych + razn;
                    System.out.println("Ответ: " + answer);
                    break;

            }
        } else if (puzzle.charAt(2) == 'x') {
            switch (oper) {
                case '+':
                    int slag = Character.getNumericValue(puzzle.charAt(0));
                    int sum = Character.getNumericValue(puzzle.charAt(4));
                    answer = sum - slag;
                    System.out.println("Ответ: " + answer);
                    break;
                case '-':
                    int vych = Character.getNumericValue(puzzle.charAt(0));
                    int razn = Character.getNumericValue(puzzle.charAt(4));
                    answer = vych - razn;
                    System.out.println("Ответ: " + answer);
                    break;

            }
        } else if (puzzle.charAt(4) == 'x') {
            switch (oper) {
                case '+':
                    int slag1 = Character.getNumericValue(puzzle.charAt(0));
                    int slag2 = Character.getNumericValue(puzzle.charAt(2));
                    answer = slag1 + slag2;
                    System.out.println("Ответ: " + answer);
                    break;
                case '-':
                    int vych1 = Character.getNumericValue(puzzle.charAt(0));
                    int vych2 = Character.getNumericValue(puzzle.charAt(2));
                    answer = vych1 - vych2;
                    System.out.println("Ответ: " + answer);
                    break;
            }
        }
    }
}



