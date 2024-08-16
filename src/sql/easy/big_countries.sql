-- @Link Problem : https://leetcode.com/problems/big-countries
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 06:54 PM

SELECT name, population, area
FROM World
WHERE area >= 3000000 OR population >= 25000000;
