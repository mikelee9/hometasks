package Task2.Vol1;


// В массиве чисел определить 2 значения, которые в сумме дают введенное число


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 0, 7, -1, -10, 14};
        int count = 0;

        System.out.println("Введите искомое значение");
        Scanner scanner = new Scanner(System.in);

        try {
            int desiredNumber = scanner.nextInt();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    int augend = array[i];
                    int addend = array[j];
                    if ((addend + augend) == desiredNumber && i < j) {
                        System.out.println("Искомое значение можно получить из следующих элементов массива: " +
                                augend + " и " + addend);
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Слагаемые исходного значения в массиве не найдены");
            }
        } catch (Exception e) {
            System.out.println("Введён не подходящий символ");
        }
    }
}
