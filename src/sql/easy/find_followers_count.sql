-- @Link Problem : https://leetcode.com/problems/find-followers-count
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 03:41 PM

SELECT user_id,
    COUNT(user_id) AS followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id;