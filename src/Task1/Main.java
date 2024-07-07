package Task1;

//Необходимо написать программу, которая сможет генерировать математические примеры для тренировки базовых навыков счета.
//Версия 1. Программа выводит в консоль 20 случайно сгенерированных примеров на умножение двух двузначных чисел

//Версия 2. Программа проверяет, что среди примеров нет повторов. Если они есть, то вместо него генерируется другой пример
// и событие фиксируется выводом в консоль

//Версия 3. Программа принимает параметры на вход
//int - количество примеров
//int - максимальная разрядность чисел
//int - действия с числами (1 - сложение, 2 - вычитание, 3 - умножение, 4 деление)


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите желаемое количество примеров");
        int problemsNumber = 0;
        try {
            problemsNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введено не число");
        }
        String[] storage = new String[problemsNumber];

        Random random = new Random();
        ArrayCreator numbers = new ArrayCreator();
        int[] arr = new int[0];

        System.out.println("Введите разрядность чисел примеров (от 2 до 5)");
        int digitNumber;
        try {
            digitNumber = scanner.nextInt();
            if (digitNumber == 2) {
                arr = numbers.createTwoDigitArray();
            } else if (digitNumber == 3) {
                arr = numbers.createThreeDigitArray();
            } else if (digitNumber == 4) {
                arr = numbers.createFourDigitArray();
            } else if (digitNumber == 5) {
                arr = numbers.createFiveDigitArray();
            } else {
                System.out.println("Будьте внимательнее, поддерживается разрядность чисел от 2 до 5");
                return;
            }
  /*          switch (digitNumber) {
                case (2):
                    arr = numbers.createTwoDigitArray();
                case (3):
                    arr = numbers.createThreeDigitArray();
                case (4):
                    arr = numbers.createFourDigitArray();
                case (5):
                    arr = numbers.createFiveDigitArray(); */
// switch-case почему то всегда вызывал .createFiveDigitArray(), не смог понять почему
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введено не число");
        }

        for (int i = 0; i < problemsNumber; i++) {
            int randomValue1 = arr[random.nextInt(arr.length)];
            int randomValue2 = arr[random.nextInt(arr.length)];
            storage[i] = (randomValue1 + " * " + randomValue2 + " =");
        }

        // trying to find duplicates and replace it
        for (int i = 0; i < storage.length; i++) {
            for (int j = i + 1; j < storage.length; j++) {
                if (storage[i].equals(storage[j])) {
                    System.out.println("Дубликат найден: " + storage[i] + " на позициях в массиве " + i + " и " + j);
                    storage[j] = arr[random.nextInt(arr.length)] + " * " + arr[random.nextInt(arr.length)] + " =";
                }
            }
            System.out.println((i + 1) + ". " + storage[i]);
        }
    }
}
