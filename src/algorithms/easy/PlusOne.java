/*
 * @Link Problem : https://leetcode.com/problems/plus-one
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 05:25 PM
 * @Problem      : You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
 *                 of the integer. The digits are ordered from most significant to the least significant in left-to-right order.
 *                 The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting
 *                 array of digits.
 * @Explanation  : Starting from the last digit, adds one to the digit and checks if it results in a value of 10. If so, sets that
 *                 digit to zero and carries the one to next digit by set a flag true. This process continues until the loop completes.
 *                 If there’s still a carry after processing all digits (indicated by the flag being true), a new array is returned
 *                 with an extra leading 1. This handles cases like adding one to numbers like 999, resulting in 1000.
 * */

package algorithms.easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int[] newDigits = new int[size + 1];
        boolean flag = true;
        for (int i = size-1; i >= 0; i--) {
            int value = digits[i];
            if(flag){
                value += 1;
                flag = false;
            }
            if(value == 10){
                value = 0;
                flag = true;
            }
            newDigits[i + 1] = value;
        }
        if(flag){
            newDigits[0] = 1;
            return newDigits;
        }
        else
            return Arrays.copyOfRange(newDigits, 1, newDigits.length);
    }
}
