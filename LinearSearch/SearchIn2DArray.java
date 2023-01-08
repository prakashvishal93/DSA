package LinearSearch.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {8 , 5 , 7 },
                {16, 17, 18},
                {20, 21, 22}
        };
        int target = 21 ;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));



    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row,col};
                }
                
            }
            
        }
        return new int[] {-1 , -1};

    }
}
