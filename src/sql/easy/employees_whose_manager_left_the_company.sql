-- @Link Problem : https://leetcode.com/problems/employees-whose-manager-left-the-company
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 03:31 PM

SELECT employee_id
FROM Employees
WHERE salary < 30000
    AND manager_id NOT IN (
        SELECT employee_id
        FROM Employees
)
ORDER BY employee_id ASC;