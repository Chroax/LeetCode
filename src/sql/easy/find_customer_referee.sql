-- @Link Problem : https://leetcode.com/problems/find_customer_referee
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 06:50 PM

SELECT name
FROM Customer
WHERE referee_id != 2 OR referee_id IS NULL;