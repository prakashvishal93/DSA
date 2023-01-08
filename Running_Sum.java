package LinearSearch;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class Running_Sum {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1};
        int n = 4;
        int ans = runningSum(arr,n);
        System.out.println(ans);

    }
    static int runningSum(int[]arr,int n){

        int sum =0;
        for (int index = 0; index <= n; index++) {
           sum += arr[index];
            }
        return sum;
    }

}


