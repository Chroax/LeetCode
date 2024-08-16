-- @Link Problem : https://leetcode.com/problems/queries-quality-and-percentage
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 10:41 AM

SELECT query_name,
    ROUND(SUM(rating / position) / COUNT(DISTINCT result), 2) AS quality,
    ROUND(SUM(IF(rating < 3, 1, 0)) / COUNT(DISTINCT result) * 100, 2) AS poor_query_percentage
FROM Queries
WHERE query_name IS NOT NULL
GROUP BY query_name;