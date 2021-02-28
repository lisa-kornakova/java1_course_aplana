package thirdTask;

public class Massives {
    public static void main(String[] args) {
        int[] fiveNumbersArray = new int[] {1,2,3,4,5};
        int lastElement = fiveNumbersArray[fiveNumbersArray.length - 1];
        fiveNumbersArray[fiveNumbersArray.length - 1] = fiveNumbersArray[0];
        fiveNumbersArray[0] = lastElement;
        System.out.println(fiveNumbersArray[0]+fiveNumbersArray[fiveNumbersArray.length/2]);
    }
}
