package data_structures.arrays;

public class ArrayOps {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // insertItem(arr, 2, 9);

        System.out.println(deleteItem(arr, 2)[2]);
    }

    public static void insertItem(
        int arr[],
        int location,
        int item){
        arr[location] = item;
    }

    public static int[] deleteItem(int arr[], int location){
        int newArr[] = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if(i == location)
                continue;
            newArr[k++] = arr[i];
            // k++;
        }

        return newArr;
    }
}
