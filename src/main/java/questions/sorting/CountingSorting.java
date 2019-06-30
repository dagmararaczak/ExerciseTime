package questions.sorting;

import java.util.Arrays;

public class CountingSorting implements Sort {

    @Override
    public int[] sort(int[] array) {

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            count[array[i] - min]++;
        }

        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--)
        {
            result[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        for (int i = 0; i < array.length; i++)
        {
            array[i] = result[i];
        }

        return result;
    }

    @Override
    public String toString() {
        return "CountingSorting";
    }
}
