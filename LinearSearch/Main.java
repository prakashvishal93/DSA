package LinearSearch.LinearSearch;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,63,6,7,8};
        int target = 63;
        int ans = linearSearch(nums,target);
        System.out.println(ans);




    }
    static int linearSearch(int[] arr, int target){
        if(arr.length ==0){
            return Integer.MAX_VALUE;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }

        }
        return -1;
    }

}
