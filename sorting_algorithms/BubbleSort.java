package sorting_algorithms;

import static java.util.Arrays.copyOfRange;

public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        return arr;
    }

    static int sum(int[] v){
        if(v.length == 1) return v[0];

        return v[0] + sum(copyOfRange(v, 1, v.length));
    }

    static int pigs(int n){
        int before = 0, current = 1, next = 0;

        for (int i = 2; i <= n; i++){
            next = current + before;
            before = current;
            current = next;
        }

        return next;
    }

    static int pigsF(int n){
        if(n <= 2) return 1;


        return pigsF(n - 1) + pigsF(n - 2);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

//         System.out.println(sum(arr));
        System.out.println(pigsF(6));
    }


}
