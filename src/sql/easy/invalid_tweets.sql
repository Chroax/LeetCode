-- @Link Problem : https://leetcode.com/problems/invalid-tweets
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:04 PM

SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;