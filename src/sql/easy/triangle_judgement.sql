-- @Link Problem : https://leetcode.com/problems/triangle-judgement
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 03:21 PM

SELECT x,
    y,
    z,
    CASE WHEN x + y > z
        THEN CASE WHEN x + z > y
            THEN CASE WHEN y + z > x
                THEN 'Yes'
                ELSE 'No' END
            ELSE 'No' END
        ELSE 'No' END AS triangle
FROM Triangle;