/*
 * @Link Problem : https://leetcode.com/problems/length-of-last-word
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 05:06 PM
 * @Problem      : Given a string s consisting of words and spaces, return the length of the last word in the string.
 *                 A word is a maximal substring consisting of non-space characters only.
 * @Explanation  : The method calculates the length of the last word in a string by splitting the string into words
 *                 and returning the length of the last word in the resulting array.
 * */
package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public int lengthOfLastWord2(String s) {
        List<String> list = new ArrayList<>();
        String words = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                words += s.charAt(i);
                list.add(words);
            }
            else
                words = "";
        }

        return list.get(list.size() - 1).length();
    }
}
