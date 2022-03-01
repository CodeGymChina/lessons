package org.codegym.lessons.lesson_04;

/**
 * @author JC Liu
 * @date 2022/2/26$
 */
public class TwoSum {

    //nums = [2,7,11,15], target = 9

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
