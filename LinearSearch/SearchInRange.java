package LinearSearch.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {


        int[] arr = { 1,2,3,4,5,6,7,8,9};
        int target = 1;
        int ans = Search(arr,target,3,5);
        System.out.println(ans);

    }
    static int Search(int[]arr, int target ,int start,int end){
        if(arr.length == 0){
            return -1;

        }
        for (int index = start; index <=end; index++) {
           int element = arr[index];
           if (element == target){
               return index;
           }


            }

        return -1;
    }
}
