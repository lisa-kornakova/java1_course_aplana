package sixthTask;

import java.util.Scanner;

public class Latinica2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фразу");
        String phrase = in.nextLine();
        String engPhrase = "";
        String[] words = phrase.split(" "); // превращаем строку в массив
        for (int i = 0; i < words.length; i++){ //идём по словам массива
            String word = words[i];
            String engWord = "";
            for (int j = 0; j < word.length(); j++) { //идём по буквам слова
                char letter = word.charAt(j);
                if (((letter >= 'a') && (letter <= 'z')) || ((letter >= 'A') && (letter <= 'Z'))) {
                    engWord = engWord + letter; //формируем из слова массива слово только из латиницы
                }
            }
            if (i == 0 && (engWord.length() == word.length())){ //сравниваем размер слова массива и сформированного слова
                engPhrase = engPhrase + engWord;
            }
            else if (engWord.length() == word.length()) {
                engPhrase = engPhrase + " " + engWord;
            }
        }
        if (engPhrase.equalsIgnoreCase("")){ //обрабатываем случай, когда ввели 1 слово не с латиницей и engPhrase осталось пустым
            System.out.println(0);
        }
        else {
            String[] engArray = engPhrase.split(" ");
            int num = engArray.length;
            for(String w: engArray){
                System.out.println(w);
            }
            System.out.println(num);
        }
    }
}
