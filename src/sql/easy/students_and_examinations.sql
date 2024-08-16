-- @Link Problem : https://leetcode.com/problems/students-and-examinations
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:47 PM

SELECT
    s.student_id,
    s.student_name,
    su.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM Students s CROSS JOIN Subjects su
    LEFT JOIN Examinations e
    ON  s.student_id = e.student_id AND su.subject_name = e.subject_name
GROUP BY
    s.student_id,
    su.subject_name
ORDER BY student_id;