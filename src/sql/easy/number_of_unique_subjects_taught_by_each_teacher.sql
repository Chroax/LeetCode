-- @Link Problem : https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 02:19 PM

SELECT teacher_id,
    COUNT(DISTINCT subject_id) AS cnt
FROM Teacher
GROUP BY teacher_id;