package questions.sorting;

import java.util.Random;
import java.util.Scanner;

public class ArraysChecker implements Checker {

    Sort sort;
    Scanner scanner;
    private final int BUBBLE_SORT = 0;
    private final int COUNTING_SORT = 1;

    @Override
    public void setSortType(int[] array) {


        Sort sort = checkNumbersTypeInArray(array);

        sort.sort(array);
        printSortType(sort);
        sort.printArray(array);


    }


    private Sort checkNumbersTypeInArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                int randomSorting = new Random().nextInt(2);


                return getSort(randomSorting);

            }
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {

                return new BubbleSorting();

            }


        }

        scanner = new Scanner(System.in);

        System.out.println("Wybierz jakim sposobem ma byc sortowana twoja tablica 0 - BubbleSort , 1 -CountingSort");

        int sortType = scanner.nextInt();

        return getSort(sortType);

    }

    public Sort getSort(int randomSorting) {
        switch (randomSorting) {

            case BUBBLE_SORT:
                return new BubbleSorting();

            case COUNTING_SORT:
                return new CountingSorting();


        }
        return null;
    }

    public void printSortType(Sort sort) {

        System.out.println("Twoja tablica jest sortowana przez : " + sort.toString());

    }
}
