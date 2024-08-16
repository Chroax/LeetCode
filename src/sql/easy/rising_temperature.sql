-- @Link Problem : https://leetcode.com/problems/rising-temperature
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:19 PM

SELECT w1.id
FROM Weather w1
WHERE w1.temperature >
    (SELECT w2.temperature
    FROM Weather w2
    WHERE w2.recordDate = DATE_ADD(w1.recordDate, INTERVAL -1 DAY))