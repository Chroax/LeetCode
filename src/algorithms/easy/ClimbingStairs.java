/*
 * @Link Problem : https://leetcode.com/problems/climbing-stairs
 * @Contributor  : Chroax
 * @Created at   : 15 August 2024, 08:43 AM
 * @Problem      : You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps.
 *                 In how many distinct ways can you climb to the top?
 * @Explanation  : Initializes two variables, ways and prev, to represent the number of ways to reach the current step and the
 *                 previous step.  It iterates from step 2 up to n, updating ways to be the sum of the current number of ways
 *                 and the number of ways to reach the previous step (prev). This is because to get to the current step, one can
 *                 come from either the step before it (single step) or two steps before it (double step). After updating, prev is
 *                 set to the old value of ways for the next iteration.
 * */
package algorithms.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1 || n == 0)
            return 1;
        int ways = 1;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            int temp = ways;
            ways += prev;
            prev = temp;
        }

        return ways;
    }
}
