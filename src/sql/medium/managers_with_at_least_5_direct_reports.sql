-- @Link Problem : https://leetcode.com/problems/managers-with-at-least-5-direct-reports
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 08:49 AM

SELECT e1.name
FROM Employee e1 INNER JOIN Employee e2
    ON e1.id = e2.managerId
GROUP BY e1.id
HAVING COUNT(e2.id) >= 5;