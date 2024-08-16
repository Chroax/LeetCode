-- @Link Problem : https://leetcode.com/problems/game-play-analysis-iv
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 11:51 AM

WITH TotalPlayer AS (
    SELECT DISTINCT player_id,
        MIN(event_date) AS first_login_date
    FROM Activity
    GROUP BY player_id
)
SELECT
    ROUND(SUM(DATEDIFF(a.event_date, tp.first_login_date) = 1) / COUNT(DISTINCT a.player_id), 2) AS fraction
FROM Activity a
INNER JOIN TotalPlayer tp
    ON a.player_id = tp.player_id;