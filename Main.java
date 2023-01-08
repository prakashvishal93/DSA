package LinearSearch;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7,553,545345,634,534543,19};
        int target = 10 ;
        int ans = LinearSearch(nums,target);
        System.out.println(ans);

    }
    static int LinearSearch(int[] arr,int target){
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
