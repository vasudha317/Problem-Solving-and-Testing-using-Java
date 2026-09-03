import java.util.*;

class Solution {
    public static int maxSubArray(int[] nums) {
        int[] result = {nums[0], nums[0]};

        Arrays.stream(nums)
            .skip(1)
            .forEach(num -> {
                result[0] = Math.max(num, result[0] + num);
                result[1] = Math.max(result[1], result[0]);
            });

        return result[1];
    }
}


Input
nums =[-2,1,-3,4,-1,2,1,-5,4]

Output
6
