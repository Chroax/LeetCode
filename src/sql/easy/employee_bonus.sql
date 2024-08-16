-- @Link Problem : https://leetcode.com/problems/employee-bonus
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:41 PM

SELECT e.name, b.bonus
FROM Employee e LEFT JOIN Bonus b
    USING(empId)
WHERE b.bonus < 1000 OR b.bonus IS NULL