package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] nums = {99,929,33,44,66,77,4435};
        int target = 4435  ;
        System.out.println(linearSearch(nums,target,2,4));

    }
    static int linearSearch(int[]arr, int target, int start,int end){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];

            if(element == target){
                return index;
            }

        }
        return -1;
    }
}
