package LinearSearch;

import javax.sound.sampled.Line;

public class booleanValues {
    public static void main(String[] args) {
        int[] nums = {12,13,14,55,66,77,99};
        int target = 99;
        boolean ans = LinearSearch(nums,target);
        System.out.println(ans);


    }
    static boolean LinearSearch(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }

        }
        return false;


    }
}
