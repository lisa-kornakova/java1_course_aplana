package finalTask;
import java.util.Scanner;
public class Zagadki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String otvet = "Заархивированный вирус";
        String podskazka = "Подсказка";
        System.out.println("Отгадай загадку -- \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.\" Введи ответ:");
        for (int i = 1; i < 4; i++) {
            // началась первая попытка
            if (i == 1) { //первая попытка ввода
                String popytka1 = in.nextLine();
                if (popytka1.equalsIgnoreCase(otvet)) { //если сразу правильный ответ
                    System.out.println("Правильно!");
                    break;
                } else if (popytka1.equalsIgnoreCase(podskazka)) { //если использует подсказку
                    System.out.println("Это можно найти в твоём компьютере. Но надеюсь, что нет;)");
                    String popytka1pod = in.nextLine();
                    if (popytka1pod.equalsIgnoreCase(otvet)) {
                        System.out.println("Правильно!");
                        break;
                    } else {
                        System.out.println("Обидно, приходи в другой раз!");
                        break;
                    }
                } else { //ввел неверный ответ в первую попытку сразу
                    System.out.println("Подумай еще!");
                    continue;
                }
            }
            // началась вторая попытка
            else if (i == 2) { //вторая попытка ввода
                String popytka2 = in.nextLine();
                if (popytka2.equalsIgnoreCase(otvet)) { //если сразу правильный ответ
                    System.out.println("Правильно!");
                    break;
                }
                else if (popytka2.equalsIgnoreCase(podskazka)) { //если использует подсказку при второй попытке
                    System.out.println("Подсказка уже недоступна.");
                    String popytka2pod = in.nextLine();
                    if (popytka2pod.equalsIgnoreCase(otvet)) {
                        System.out.println("Правильно!");
                        break;
                    } else { // ввел неверный ответ во вторую попытку после подсказки
                        System.out.println("Подумай еще!");
                        continue;
                    }

                }
                else{ // ввел неверный ответ во вторую попытку сразу
                    System.out.println("Подумай еще!");
                    continue;
                }

            }
            // началась третья попытка
            else {
                String popytka3 = in.nextLine();
                if (popytka3.equalsIgnoreCase(otvet)) { //если сразу правильный ответ
                    System.out.println("Правильно!");
                    break;
                }
                else if (popytka3.equalsIgnoreCase(podskazka)) { //если использует подсказку при второй попытке
                    System.out.println("Подсказка уже недоступна.");
                    String popytka3pod = in.nextLine();
                    if (popytka3pod.equalsIgnoreCase(otvet)) {
                        System.out.println("Правильно!");
                        break;
                    } else { // ввел неверный ответ во вторую попытку после подсказки
                        System.out.println("Обидно, приходи в другой раз!");
                        break;
                    }
                }
                else { // если сразу неправльный ответ
                    System.out.println("Обидно, приходи в другой раз!");
                    break;
                }
            }
        }

    }
}
