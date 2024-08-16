-- @Link Problem : https://leetcode.com/problems/article-views-i
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 06:58 PM

SELECT author_id AS id
FROM Views
WHERE author_id = viewer_id
GROUP BY id
ORDER BY id ASC;