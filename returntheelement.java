package LinearSearch;

public class returntheelement {
    public static void main(String[] args) {
        int[] nums = {12,3,4,345,6,9};
        int target = 3;
        int ans = linearSearch(nums,target);
        System.out.println(ans);


    }
    static int linearSearch(int arr[], int target){
        if (arr.length ==0){
            return Integer.MAX_VALUE;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return element;
            }

        }

        return -1;
    }

}
