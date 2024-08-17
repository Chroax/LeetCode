-- @Link Problem : https://leetcode.com/problems/patients-with-a-condition
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 09:28 PM

SELECT *
FROM Patients
WHERE conditions LIKE '% DIAB1%'
    OR conditions LIKE 'DIAB1%'