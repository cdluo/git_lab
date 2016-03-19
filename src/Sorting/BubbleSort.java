package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] array) {
	  boolean flag = true;   
    int temp;   

    while (flag){
      flag= false;    //set flag to false awaiting a possible swap
        for(int j=0; j < array.length -1; j++){
          if (array[j] > array[j+1]){   
            temp = array[j];                
                array[j] = array[j+1];
                array[j+1] = temp;
                flag = true;              //shows a swap occurred  
            } 
        } 
    }
    
    return array;
	}
}
