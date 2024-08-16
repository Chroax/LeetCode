-- @Link Problem : https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 04:51 PM

SELECT e1.employee_id,
    e1.name,
    COUNT(e2.employee_id) AS reports_count,
    ROUND(AVG(e2.age), 0) AS average_age
FROM Employees e1
INNER JOIN Employees e2
    ON e1.employee_id  = e2.reports_to
GROUP BY e1.employee_id
ORDER BY e1.employee_id