package PW_TEST;

import java.util.Arrays;

public class TESTQ1 {
    static int[] moveZero(int[] nums){
        int i=0;
        for(int num:nums){
            if(num!=0){
                nums[i++]=num;
            }
        }
        while(i<nums.length){
            nums[i++]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        System.out.println(Arrays.toString(moveZero(arr)));
    }
}
