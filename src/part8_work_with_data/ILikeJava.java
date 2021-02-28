package sixthTask;
import java.util.Scanner;

public class ILikeJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фразу");
        String phrase = in.nextLine();
        boolean isStart = phrase.startsWith("I like");
        boolean isCont = phrase.contains("Java");
        boolean isEnd = phrase.endsWith("!!!");
        if (isStart&&isCont&&isEnd){
            String newPhrase = phrase.toUpperCase();
            System.out.println(newPhrase);
            String replPhrase = phrase.replace('a', 'o');
            System.out.println(replPhrase);
        }
    }
}
