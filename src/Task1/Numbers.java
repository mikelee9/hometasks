package Task1;

public class Numbers {

    public int[] createArray() {
        int[] arr = new int[180];

        for (int i = 0; i < 90; i++) {
            arr[i] = 10 + i;
        }
        // Сначала без него сделал, потом подумал, что отрицательные тоже двузначные и добавил. Выглядит как то костыльно,
        // но для единичной генерации м.б. и норм?
        for (int i = 90; i < 180; i++) {
            arr[i] = 80 - i;
        }

        return arr;
    }
}
