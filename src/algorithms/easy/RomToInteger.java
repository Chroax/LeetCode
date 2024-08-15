/*
 * @Link Problem : https://leetcode.com/problems/proman-to-integer
 * @Contributor  : Chroax
 * @Created at   : 09 August 2024, 05:27 PM
 * @Problem      : Roman numerals are represented by seven different symbols: I(1), V(5), X(10), L(50), C(100), D(500) and M(1000).
 *                 Given a roman numeral, convert it to an integer.
 * @Explanation  : The algorithm converts a Roman numeral string to an integer by iterating through each character and evaluating
 *                 its value. It checks for specific Roman numeral characters ('I', 'V', 'X', 'L', 'C', 'D', 'M') and their possible
 *                 subtractive combinations (e.g., 'IV' or 'IX'). If a subtractive pattern is found, the algorithm adds the
 *                 corresponding value to the total and skips the next character. For other characters, it directly adds their value.
 *                 It uses a brute-force approach to manually handle Roman numeral rules.
 * */

package algorithms.easy;

public class RomToInteger {
    public int romanToInt(String s) {
        char[] split = s.toCharArray();
        int number = 0;
        for (int i = 0; i < split.length; i++) {
            boolean flag = false;
            if(split[i] == 'I'){
                if(i + 1 < split.length){
                    if(split[i + 1] == 'V' || split[i + 1] == 'X'){
                        if(split[i + 1] == 'V')
                            number += 4;
                        else if(split[i + 1] == 'X')
                            number += 9;
                        flag = true;
                    }
                    else
                        number += 1;
                }
                else
                    number += 1;
            }
            else if(split[i] == 'V'){
                number += 5;
            }
            else if(split[i] == 'X'){
                if(i + 1 < split.length){
                    if(split[i + 1] == 'L' || split[i + 1] == 'C'){
                        if(split[i + 1] == 'L')
                            number += 40;
                        else if(split[i + 1] == 'C')
                            number += 90;
                        flag = true;
                    }
                    else
                        number += 10;
                }
                else
                    number += 10;
            }
            else if(split[i] == 'L'){
                number += 50;
            }
            if(split[i] == 'C'){
                if(i + 1 < split.length){
                    if(split[i + 1] == 'D' || split[i + 1] == 'M'){
                        if(split[i + 1] == 'D')
                            number += 400;
                        else if(split[i + 1] == 'M')
                            number += 900;
                        flag = true;
                    }
                    else
                        number += 100;
                }
                else
                    number += 100;
            }
            else if(split[i] == 'D'){
                number += 500;
            }
            else if(split[i] == 'M'){
                number += 1000;
            }
            System.out.println(number + ", " + i);

            if(flag)
                i++;
        }

        return number;
    }
}
