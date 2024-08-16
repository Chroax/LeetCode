-- @Link Problem : https://leetcode.com/problems/percentage-of-users-attended-a-contest
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 10:18 AM

SELECT r.contest_id,
    ROUND(COUNT(DISTINCT r.user_id) / tu.total_user_count * 100, 2) AS percentage
FROM Register r INNER JOIN (
    SELECT COUNT(DISTINCT user_id) AS total_user_count
    FROM Users
) AS tu
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;