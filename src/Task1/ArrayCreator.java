package Task1;

public class ArrayCreator {

    public int[] createTwoDigitArray() {
        int[] arr = new int[180];

        for (int i = 0; i < 90; i++) {
            arr[i] = 10 + i;
        }
        for (int i = 90; i < 180; i++) {
            arr[i] = 80 - i;
        }

        return arr;
    }

    public int[] createThreeDigitArray() {
        int[] arr = new int[1800];

        for (int i = 0; i < 900; i++) {
            arr[i] = 100 + i;
        }
        for (int i = 900; i < 1800; i++) {
            arr[i] = 800 - i;
        }

        return arr;
    }

    public int[] createFourDigitArray() {
        int[] arr = new int[18000];

        for (int i = 0; i < 9000; i++) {
            arr[i] = 1000 + i;
        }
        for (int i = 9000; i < 18000; i++) {
            arr[i] = 8000 - i;
        }

        return arr;
    }

    public int[] createFiveDigitArray() {
        int[] arr = new int[180000];

        for (int i = 0; i < 90000; i++) {
            arr[i] = 10000 + i;
        }
        for (int i = 90000; i < 180000; i++) {
            arr[i] = 80000 - i;
        }

        return arr;
    }
}
