-- @Link Problem : https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:08 PM

SELECT eu.unique_id, e.name
FROM Employees e LEFT JOIN EmployeeUNI eu
    USING(id);