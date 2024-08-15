/*
 * @Link Problem : https://leetcode.com/problems/add-binary
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 05:46 PM
 * @Problem      : Given two binary strings a and b, return their sum as a binary string.
 * @Explanation  : First align the lengths of the two input binary with leading zeros. Then iterates through the strings from right
 *                 to left, summing corresponding bits along with any carry from the previous bit. For each bit position, calculates
 *                 the sum of the bits and the carry, determines the result bit to be placed in the result string, and updates the
 *                 carry for the next bit. If there is a carry left after processing all bit positions, prepends a '1' to the result.
 * */
package algorithms.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');

        char[] newVal = new char[maxLength];
        boolean carry = false;

        for (int i = maxLength - 1; i >= 0; i--) {
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);
            int sum = (aChar - '0') + (bChar - '0');
            if(carry)
                sum += 1;
            newVal[i] = (char) ('0' + (sum % 2));

            if(sum >= 2)
                carry = true;
            else
                carry = false;
        }
        if(carry)
            return "1" + new String(newVal);
        else
            return new String(newVal);
    }
}
