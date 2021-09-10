package Sorting;

import java.util.Scanner;
public class InsertionSort {
    // swapping two numbers
    static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // the following steps(14-20) are used to create an array
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

        /* insertion sort
         * sorting elements {74,32,89,55,21,64}
         * 32,74,89,55,21,64
         * 32,74,89,55,21,64
         * 32,55,74,89,21,64
         * 21,32,55,74,89,64
         * 21,32,55,64,74,89 */

        for(int i = 1; i < n; i++){
            for (int j = i-1; j >= 0 ; j--){
                if(array[i] < array[j]) {
                    swap(array,j,i);
                    i = j;
                }
            }
        }

        // printing the final array
        System.out.printf("\nSorted array is : ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ",array[i]);
        }
    }
}
