package Task1;

//Необходимо написать программу, которая сможет генерировать математические примеры для тренировки базовых навыков счета.
//Версия 1. Программа выводит в консоль 20 случайно сгенерированых примеров на умножение двух двузначных чисел

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayCreator numbers = new ArrayCreator();

        int[] arr = numbers.createArray();

        for (int i = 0; i < 20; i++) {
            int randomValue1 = arr[random.nextInt(arr.length)];
            int randomValue2 = arr[random.nextInt(arr.length)];

            System.out.println((i + 1) + ". " + randomValue1 + " * " + randomValue2 + " =");
        }
    }
}