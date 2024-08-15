/*
 * @Link Problem : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 04:30 PM
 * @Problem      : Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 *                 or -1 if needle is not part of haystack.
 * @Explanation  : Locates the first occurrence of a substring (needle) within a string (haystack) by replacing needle
 *                 with a marker, splitting the string, and calculating the position based on the accumulated length of
 *                 preceding segments. It returns the index of the first occurrence or -1 if the substring is not found.
 * */
package algorithms.easy;

public class FirstOccurrenceStr {
    public int strStr(String haystack, String needle) {
        int index = -1;
        int size = 0;
        String occurrenceStr = haystack.replace(needle, "-#");
        String[] words = occurrenceStr.split("-");

        for (int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty()){
                if (words[i].charAt(0) == '#'){
                    index = size;
                    break;
                }
                size += words[i].length();
            }
        }

        return index;
    }
}
