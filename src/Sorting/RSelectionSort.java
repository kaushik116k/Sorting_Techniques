package Sorting;
import java.util.Scanner;
public class RSelectionSort {

    static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void SelectionSort(int array[], int start, int n) {
        if(start >= n-1)
            return;
        int minPos = start;
        for(int i = start + 1; i < n; i++) {
            if(array[minPos] > array[i]){
                minPos = i;
            }
        }
        if(start != minPos){
            swap(array,minPos,start);
        }
        SelectionSort(array,start+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // the following steps(8-14) are used to create an array
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("enter the value of "+ i + "th element");
            array[i] = sc.nextInt();
        }

        // printing the initial array
        System.out.print("Initial array is : ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ",array[i]);
        }

        /* selection sort
         * sorting elements {74,32,89,55,21,64}
         * 21,32,89,55,74,64
         * 21,32,89,55,74,64
         * 21,32,55,89,74,64
         * 21,32,55,64,74,89 */

        SelectionSort(array,0,n);
        // printing the final array
        System.out.printf("\nSorted array is : ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ",array[i]);
        }
    }
}
