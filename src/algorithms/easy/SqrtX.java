/*
 * @Link Problem : https://leetcode.com/problems/
 * @Contributor  : Chroax
 * @Created at   : 10 August 2024, 09:02 AM
 * @Problem      : Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned
 *                 integer should be non-negative as well. You must not use any built-in exponent function or operator. For example,
 *                 do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * @Explanation  : The mySqrt method calculates the square root of a given non-negative integer x using the Newton-Raphson method,
 *                 which is an iterative numerical technique. It starts with an initial guess n, set to x, and an epsilon value to
 *                 define the precision of the result. The method continuously improves the guess using the formula ((n + (x/n)) / 2)
 *                 which is derived from Newton's method for finding square roots. The iteration continues until the difference
 *                 between n and x / n is less than the specified epsilon, indicating that the guess is close enough to the actual
 *                 square root.
 * */
package algorithms.easy;

public class SqrtX {
    public int mySqrt(int x) {
        double n = x;
        double epsilon = 0.000001;
        while ((n - x / n) > epsilon) {
            n = (n + x / n) / 2.0;
        }
        return (int) n;
    }
}
