package LinearSearch.LinearSearch;

public class MINVALUE {
    public static void main(String[] args) {
        int[][] arr = {
                {8 , 5 , 7 },
                {16, 17, 18},
                {20, 21, 22}
        };
        System.out.println(min(arr));

    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
