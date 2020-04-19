
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 2, -19, 1, 3, 7, 5};
        sort(array);
    }

    public static int smallest(int[] array){
        int indexofsmol = 0;
        for (int i = 0; i<array.length;i++) {
            if (array[indexofsmol]>array[i]) {
                indexofsmol = i;
            }
        }
        return array[indexofsmol];
    }
    
    public static int indexOfSmallest(int[] array){
        int indexofsmol = 0;
        for (int i = 0; i<array.length;i++) {
            if (array[indexofsmol]>array[i]) {
                indexofsmol = i;
            }
        }
        return indexofsmol;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexofsmol = startIndex;
        for (int i = startIndex; i<table.length;i++) {
            if (table[indexofsmol]>table[i]) {
                indexofsmol = i;
            }
        }
        return indexofsmol;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i<array.length;i++) {
            swap(array,i,indexOfSmallestFrom(array,i));
        }
    }
}
