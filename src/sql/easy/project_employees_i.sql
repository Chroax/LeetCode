-- @Link Problem : https://leetcode.com/problems/project-employees-i
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 10:08 AM

SELECT p.project_id,
    ROUND(SUM(e.experience_years) / COUNT(e.employee_id), 2) AS average_years
FROM Project p INNER JOIN Employee e
    ON p.employee_id = e.employee_id
GROUP BY p.project_id;