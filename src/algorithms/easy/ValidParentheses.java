/*
 * @Link Problem : https://leetcode.com/problems/valid-parentheses
 * @Contributor  : Chroax
 * @Created at   : 10 August 2024, 08:38 PM
 * @Problem      : Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
 *                 is valid (Open brackets must be closed by the same type of brackets, closed in the correct order, and
 *                 Every close bracket has a corresponding open bracket of the same type).
 * @Explanation  : Uses a stack to check if a string is valid by ensuring that each opening bracket has a corresponding closing bracket.
 *                 The stack is used to keep track of opening brackets as they are encountered. When a closing bracket is encountered,
 *                 the algorithm checks if the top of the stack contains the matching opening bracket. If it does, the opening bracket
 *                 is popped from the stack; otherwise, the string is deemed invalid.
 * */

package algorithms.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()) {
            switch (character){
                case '(', '[', '{'-> stack.push(character);
                case ')'-> {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }
                case ']'-> {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
                case '}'-> {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }
                default -> { return false; }
            }
        }
        return stack.empty();
    }
}
