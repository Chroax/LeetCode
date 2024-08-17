-- @Link Problem : https://leetcode.com/problems/last-person-to-fit-in-the-bus
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 04:29 PM

WITH CumulativeWeight AS(
    SELECT turn,
        person_name,
        weight,
        SUM(weight) OVER (ORDER BY turn ASC) AS total_weight
    FROM Queue
)
SELECT person_name
FROM CumulativeWeight
WHERE total_weight <= 1000
ORDER BY total_weight DESC LIMIT 1;