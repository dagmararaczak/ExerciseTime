package questions.sorting;


public class BubbleSorting implements Sort {

    @Override
    public int[] sort(int[] array) {

        for(int i = 0; i<array.length; i++){

            for (int j = i; j<array.length;j++){


                if(array[i]>array[j]){

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }


            }
        }


        return array;

    }

    @Override
    public String toString() {
        return "BubbleSorting";
    }
}
