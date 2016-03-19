package Sorting;

public class InsertionSort {


    /**
    * insertionSort            sorts an array of integers using insertion sort
    * 
    * @param unsortedArray     an unsorted array of integers
    * @return                  the input array, sorted least to greatest
    */
    public static int[] insertionSort(int[] unsortedArray) {
        for(int i = 1; i < array.length; i++){
          int curr = array[i];
          int j = i-1;
          while(j>= 0 && array[j] > curr){
            array[j + 1] = array [j];
            j -= 1;
          }
         array[j+1] = curr;
        }
        
        return array;
    }
}
