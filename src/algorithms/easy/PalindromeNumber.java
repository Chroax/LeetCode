/*
 * @Link Problem : https://leetcode.com/problems/palindrome-number
 * @Contributor  : Chroax
 * @Created at   : 09 August 2024, 05:12 PM
 * @Problem      : Given an integer x, return true if x is a palindrome and false otherwise.
 *                 Solve it without converting the integer to a string.
 * @Explanation  : First handles special cases where the number is negative or ends with a zero (except zero itself),
 *                 which cannot be palindromes. It then reverses the integer by extracting digits from the end and reconstructing
 *                 a new number. Finally, compares the reversed number with the original number to determine if they are the same.
 * */

package algorithms.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if((x < 0 || x % 10 == 0) && x != 0)
            return false;

        int remainingNum = x;
        int number = 0;
        while(remainingNum > 0){
            int lastDigit = remainingNum % 10;
            remainingNum = remainingNum / 10;
            number = number * 10 + lastDigit;
        }

        return number == x;
    }
}
