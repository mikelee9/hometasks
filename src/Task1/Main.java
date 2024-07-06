package Task1;

//Необходимо написать программу, которая сможет генерировать математические примеры для тренировки базовых навыков счета.
//Версия 1. Программа выводит в консоль 20 случайно сгенерированых примеров на умножение двух двузначных чисел

//Версия 2. Программа проверяет, что среди примеров нет повторов. Если они есть, то вместо него генеририруется другой пример
// и событие фиксируется выводом в консоль

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayCreator numbers = new ArrayCreator();

        int[] arr = numbers.createArray();
        String[] storage = new String[20];

        for (int i = 0; i < 20; i++) {
            int randomValue1 = arr[random.nextInt(arr.length)];
            int randomValue2 = arr[random.nextInt(arr.length)];
            storage[i] = (randomValue1 + " * " + randomValue2 + " =");
        }

        // trying to find duplicates and replace it
        for (int i = 0; i < storage.length; i++) {
            for (int j = i + 1; j < storage.length; j++) {
                if (storage[i].equals(storage[j])) {
                    System.out.println("Дубликат найден: " + storage[i] + " на позициях " + i + " и " + j);
                    storage[i] = arr[random.nextInt(arr.length)] + " * " + arr[random.nextInt(arr.length)] + " =";
                }
            }
            System.out.println((i + 1) + ". " + storage[i]);
        }
    }
}
