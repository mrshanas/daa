package data_structures.arrays;

/*
 * This class contains the method linearize that
 * takes a 2-dimensional array and returns the
 * 1-dimensional array with all the elements of the
 * 2D array
 */

public class LinearizeArrays {
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30},
            {40,50,55,58},
            {60,70,80}
        };

    for (int i = 0; i < linearize(arr).length; i++) {
        System.out.println(linearize(arr)[i]);
    }
    }

    public static int[] linearize(int arr[][]){
        int position = 0, arrSize = 0;

        /*
         * The below for loop is to determine the total
         * size of the resultant 1-dimensional array
         */
           for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrSize++;
            }
        }

        int ans[] = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ans[position] = arr[i][j];
                position++;
            }
        }
        return ans;
    }
}
