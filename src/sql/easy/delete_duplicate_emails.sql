-- @Link Problem : https://leetcode.com/problems/delete-duplicate-emails
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 09:36 PM

-- SOLUTION 1
DELETE p1
FROM Person p1
JOIN (
    SELECT MIN(id) AS min_id,
        email
    FROM Person
    GROUP BY email
) p2
ON p1.email = p2.email AND p1.id > p2.min_id;

-- SOLUTION 2
DELETE p1
FROM person p1, person p2
WHERE p1.email = p2.email
    AND p1.id > p2.id;