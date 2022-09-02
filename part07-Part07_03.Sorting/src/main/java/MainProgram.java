
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int x = 0; x < array.length; x++){    
            swap(array, x, indexOfSmallestFrom(array, x));
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static int smallest(int[] array){
        int smallest = 99999;
        for(int x : array){
            if (x < smallest){
                smallest = x;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        for (int x = 0; x < array.length; x++){
            if (smallest(array) == array[x]){
                index = x;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int start){
        int index = 0;
        int smallest = 99999;
        for (int x = start; x < array.length; x++){
            if (smallest > array[x]){
                smallest = array[x];
                index = x;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int helper = 0;
        helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
        
    }

}
