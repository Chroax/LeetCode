-- @Link Problem : https://leetcode.com/problems/not-boring-movies
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 09:26 AM

SELECT *
FROM Cinema
WHERE description != 'boring' AND id % 2 = 1
ORDER BY rating DESC;