package questions.sorting;

public interface Checker {

    void setSortType(int[] array);
    Sort getSort(int randomSorting);
    void printSortType(Sort sort);
}
