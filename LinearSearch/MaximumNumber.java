package LinearSearch.LinearSearch;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {9,4,5,6,7,99,- 33,2};
        System.out.println(min(arr));


    }


    static int min(int arr[]){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
