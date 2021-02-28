package sixthTask;
import java.util.Scanner;

public class Latinica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фразу");
        String phrase = in.nextLine();
        String engPhrase = "";
        for (int i=0; i<phrase.length();i++) {
            char letter = phrase.charAt(i);
            if (((letter >= 'a') && (letter <= 'z')) || ((letter >= 'A') && (letter <= 'Z'))) {
                if (!(phrase.charAt(i + 1) == ' ')) {
                    engPhrase = engPhrase + letter;
                } else {
                    engPhrase = engPhrase + letter + " ";
                }
            }
        }
        System.out.println(engPhrase);
        String [] wordNum = engPhrase.split(" ");
        System.out.println(wordNum.length);
    }
}
