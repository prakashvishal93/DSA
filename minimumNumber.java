package LinearSearch;

public class minimumNumber {
    public static void main(String[] args) {
        int[] nums = {12,3,4,345,-6,9};
        System.out.println(min(nums));
    }
    static int min(int arr[]){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;




        }
    }

