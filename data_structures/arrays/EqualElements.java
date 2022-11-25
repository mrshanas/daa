package data_structures.arrays;

/*
 * Write a method/function equals that determines
 * whether two 2-dimensional arrays have the same
 * corresponding elements
 */

public class EqualElements {
    public static void main(String[] args) {
        int arr1[][] = {
            {50,40},
            {10,20,30},
            // {10,20,30}
        }, arr2[][] = {
            {50,40}, {10,20,30}
        };

        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int arr1[][], int arr2[][]){
        /*  If the arrays doesn't contain the same lengths then
            they're not equal
        */
        if(arr1.length != arr2.length)
            return false;

        boolean isEqual = false;

        for (int i = 0; i < arr1.length; i++) {
            /*
             * Also if each child array doesn't have the
             * same length also they're not equal
             */
            if(arr1[i].length != arr2[i].length)
                return false;

            for (int j = 0; j < arr2[i].length; j++) {
                isEqual = arr1[i][j] == arr2[i][j];
            }
        }
        return isEqual;
    }
}
