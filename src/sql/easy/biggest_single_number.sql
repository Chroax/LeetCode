-- @Link Problem : https://leetcode.com/problems/biggest-single-number
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 04:04 PM

SELECT MAX(num) as num
FROM( SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS subquery;