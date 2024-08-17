-- @Link Problem : https://leetcode.com/problems/primary-department-for-each-employee
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 02:26 PM

WITH TotalDepartment AS(
    SELECT employee_id,
        COUNT(department_id) AS total_department
    FROM Employee
    GROUP BY employee_id
)
SELECT employee_id,
    e.department_id
FROM Employee e
INNER JOIN TotalDepartment td
    USING(employee_id)
WHERE td.total_department = 1
    OR e.primary_flag = 'Y'
GROUP BY employee_id;