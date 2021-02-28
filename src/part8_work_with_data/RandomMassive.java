package sixthTask;

public class RandomMassive {
    public static void main(String[] args) {
        int [] randMassive = new int[15];
        int a = -20;
        int b = 20;
        int x = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < randMassive.length; i++){
            x =  a + (int)(Math.random()*((b - a) + 1));
            randMassive[i] = x;
        }
        for (int i = 0; i < randMassive.length; i++){
            min = Math.min(min, randMassive[i]);
            max = Math.max(max, randMassive[i]);
        }
        System.out.printf("Максимальный элемент - %d, минимальный - %d \n", max, min);
        int maxMod = Math.max(Math.abs(min),Math.abs(max));
        System.out.println(maxMod);
    }
}

