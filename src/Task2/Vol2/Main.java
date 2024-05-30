package Task2.Vol2;

// В массиве чисел определить 3 значения, которые в сумме дают введенное число

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -5, -6, -2};


        int desiredNumber = 10;
        boolean found = false;

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == desiredNumber) {
                        System.out.println("Искомое значение можно получить из следующих элементов массива: " +
                                array[i] + ", " + array[j] + ", " + array[k]);
                        found = true;

                    }
                }
            }
        }
        if (!found) {
            System.out.println("Слагаемые исходного значения в массиве не найдены");
        }
    }
}
