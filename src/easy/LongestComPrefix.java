/*
 * @Link Problem : https://leetcode.com/problems/longest-common-prefix
 * @Contributor  : Chroax
 * @Created at   : 09 August 2024, 06:04 PM
 * @Problem      : Write a function to find the longest common prefix string amongst an array of strings.
 *                 If there is no common prefix, return an empty string "".
 * @Explanation  : Starts by assuming the entire first string as the prefix. Then, for each subsequent string
 *                 in the list, it checks if the current prefix is a prefix of the string. If not, it iteratively
 *                 shortens the prefix by removing the last character until a match is found or the prefix becomes empty.
 *                 Finally, it returns the longest common prefix that was found.
 * */

package easy;

public class LongestComPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0)
                prefix = strs[0].substring(0, prefix.length()-1);
        }
        return prefix;
    }
}
