-- @Link Problem : https://leetcode.com/problems/average-time-of-process-per-machine
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:31 PM

SELECT machine_id,
    ROUND(AVG(a2.timestamp - a1.timestamp), 3) AS processing_time
FROM Activity a1 INNER JOIN Activity a2
    USING(machine_id)
WHERE a1.activity_type = 'start'
    AND a2.activity_type = 'end'
GROUP BY a1.machine_id;