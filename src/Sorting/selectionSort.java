package Sorting;
import java.util.*;
public class selectionSort {
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

        for(int i = 0; i < n; i++) {
            int minPos = i;
            for (int j = i+1; j < n; j++){
                if(array[minPos] > array[j]){
                    minPos = j;
                }
            }
            if(i != minPos){
                int temp = array[i];
                array[i] = array[minPos];
                array[minPos] = temp;
            }
        }

        // printing the final array
        System.out.printf("\nSorted array is : ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ",array[i]);
        }
    }
}
