-- @Link Problem : https://leetcode.com/problems/user-activity-for-the-past-30-days-i
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 02:27 PM

SELECT activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE DATEDIFF('2019-07-27', activity_date) < 30
    AND activity_date <= '2019-07-27'
GROUP BY activity_date;