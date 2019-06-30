package questions.sorting;

public interface Sort {


    int[] sort(int[] array);

    default void printArray(int[] array){

        for (int i : array) {
            System.out.println(i);
        }

    }
}
