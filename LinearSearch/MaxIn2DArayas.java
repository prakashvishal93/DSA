package LinearSearch.LinearSearch;

public class MaxIn2DArayas {
    public static void main(String[] args) {
        int[][] arr = {
                {8 , 5 , 7 },
                {16, 117, 18},
                {20, 21, 22}
        };
        System.out.println(max(arr));

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max =arr[row][col];

                }

            }
        }
        return max;
    }

}
