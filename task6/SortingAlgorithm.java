package task6;

import java.util.*;
public class SortingAlgorithm {
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j <= right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;  
    }

    static void quicksort(int[] array, int left, int right) {
        if (left >= right)
            return;
        int part = partition(array, left, right);
        quicksort(array, left, part - 1);
        quicksort(array,part+1, right);

    }
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                // print(array);
            }
            // System.out.println();
        }
    }
    
    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        // bubbleSort(array);
        // int[] array={3,6,4,5,2,1};
        quicksort(array, 0, array.length - 1);
        print(array);

    }
}
