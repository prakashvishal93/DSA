package LinearSearch.LinearSearch;
//https://leetcode.com/problems/binary-search/

public class LeetCode704 {
    public static void main(String[] args) {
        int[] arr =  {-1,0,3,5,9,12};
        int target = 12;
        System.out.println(nums(arr,target));

    }
    static int nums(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                target = arr[index];
                return index;
            }

        }
        return -1;
    }
}
