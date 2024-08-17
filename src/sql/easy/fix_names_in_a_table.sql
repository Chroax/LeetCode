-- @Link Problem : https://leetcode.com/problems/fix-names-in-a-table
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 09:23 PM

SELECT user_id,
    CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name, 2, LENGTH(name)))) AS name
FROM Users