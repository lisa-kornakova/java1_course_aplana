package firthTask;

import java.util.Scanner;

public class Converter2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distMeasure = 1;
        int weightMeasure = 1;
        int label;
        double kg, gr, funt, uncia;
        double metr, milya, yard, foot;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int whatToConvert = in.nextInt();
        if (whatToConvert == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - фунт, 4 - унция");
            distMeasure = in.nextInt();
        }
        else {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            weightMeasure = in.nextInt();
        }
        System.out.println("Введите количество единиц");
        int Quantity = in.nextInt();
        if (whatToConvert == 1){
            switch(distMeasure){
                case 1:
                    label = Quantity;
                    gr = label*1000.0;
                    funt = label*2.205;
                    uncia = label*35.274;
                    System.out.printf("Результат:\n Килограммы: %d \n Граммы: %f \n Фунты: %f \n Унция: %f \n", label, gr, funt, uncia);
                    break;
                case 2:
                    label = Quantity;
                    kg = label/1000.0;
                    funt = label*0.0022;
                    uncia = label*0.0352;
                    System.out.printf("Результат:\n Граммы: %d \n Килограммы: %f \n Фунты: %f \n Унция: %f \n", label, kg, funt, uncia);
                    break;
                case 3:
                    label = Quantity;
                    gr = label*454.0;
                    kg = label/2.205;
                    uncia = label*16.0;
                    System.out.printf("Результат:\n Фунты: %d \n Килограммы: %f \n Граммы: %f \n Унция: %f \n", label, kg, gr, uncia);
                    break;
                case 4:
                    label = Quantity;
                    gr = label*28.35;
                    kg = label/35.274;
                    funt = label/16.0;
                    System.out.printf("Результат:\n Унция: %d \n Килограммы: %f \n Граммы: %f \n Фунты: %f \n", label, kg, gr, funt);
                    break;

            }
        }
        else{
            switch(weightMeasure){
                case 1:
                    label = Quantity;
                    milya = label*0.00062;
                    yard = label*1.094;
                    foot = label*3.281;
                    System.out.printf("Результат:\n Метры: %d \n Мили: %f \n Ярды: %f \n Футы: %f \n", label, milya, yard, foot);
                    break;
                case 2:
                    label = Quantity;
                    metr = label*1609.0;
                    yard = label*1760.0;
                    foot = label*5280.0;
                    System.out.printf("Результат:\n Мили: %d \n Метры: %f \n Ярды: %f \n Футы: %f \n", label, metr, yard, foot);
                    break;
                case 3:
                    label = Quantity;
                    milya = label*0.00056;
                    metr = label*0.91;
                    foot = label*3.0;
                    System.out.printf("Результат:\n Ярды: %d \n Метры: %f \n Мили: %f \n Футы: %f \n", label, metr, milya, foot);
                    break;
                case 4:
                    label = Quantity;
                    milya = label*0.00019;
                    metr = label/0.3;
                    yard = label*0.33;
                    System.out.printf("Результат:\n Футы: %d \n Метры: %f \n Мили: %f \n Ярды: %f \n", label, metr, milya, yard);
                    break;
            }
        }
    }
}
