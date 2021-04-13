package java_practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i =0, j = nums.length-1;
        int[] x = new int[2];

        HashMap<Integer, Integer> indexes = new HashMap<Integer, Integer>();

        for (int k = 0; k < nums.length; k++) {
            if (!indexes.containsKey(nums[k])) {
                indexes.put(nums[k], k+1);
            } else if (nums[k] * 2 == target) {
                x[0] = indexes.get(nums[k]);
                x[1] = k+1;
                return x;
            }
        }

        Arrays.sort(nums);
        while(i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                x[0] = indexes.get(nums[i]);
                x[1] = indexes.get(nums[j]);
                if (x[0] > x[1]) {
                    int temp = x[1];
                    x[1] = x[0];
                    x[0] = temp;
                }
                return x;
            }
        }
        return x;
    }
}
