-- @Link Problem : https://leetcode.com/problems/classes-more-than-5-students
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 03:14 PM

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;