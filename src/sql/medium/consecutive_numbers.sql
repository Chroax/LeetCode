-- @Link Problem : https://leetcode.com/problems/consecutive-numbers
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 03:44 PM

SELECT DISTINCT num AS ConsecutiveNums
FROM (SELECT id,
        num,
        LAG(num) OVER (ORDER BY id) AS beforeNum,
        LEAD(num) OVER (ORDER BY id) AS afterNum
    FROM Logs
) AS subquery
WHERE num = beforeNum
    AND beforeNum = afterNum;
