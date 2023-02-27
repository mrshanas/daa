package data_structures.arrays;

/**
 *Write a method/function isRagged that determines
  whether a two-dimensional array is a ragged array.
  Remember, a ragged array is one where all the rows
  do not have the same length.
 */

public class IsRagged {
    public static void main(String[] args) {
        // int[][] numbers = new int[10][9];

        int ragged[][] = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {3,5,6,7},
            {9,0,20,11,29,1}
        };

        int unRagged[][] = {
            {4,3,2},
            {2,3,4},
            {1,2,5},
            {9,1,4}
        };

        System.out.println(isRagged(ragged) + " is a ragged array");
        System.out.println(isRagged(unRagged) + " is not a ragged array");
    }

    public static boolean isRagged(int raggedArr[][]){

        for(int i = 0; i < raggedArr.length ; i++){
            if(raggedArr[i].length != raggedArr[0].length)
                return true;
        }
        return false;
    }
}
