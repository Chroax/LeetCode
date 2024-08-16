-- @Link Problem : https://leetcode.com/problems/confirmation-rate
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 09:13 AM

-- SOLUTION 1
SELECT user_id,
    ROUND(COALESCE((COUNT(CASE WHEN c.action = 'confirmed' THEN 1 END) / COUNT(c.action)), 0),2) AS confirmation_rate
FROM Signups s LEFT JOIN Confirmations c
    USING(user_id)
GROUP BY user_id
ORDER BY confirmation_rate;

-- SOLUTION 2
SELECT user_id,
    ROUND(AVG(IF(c.action = 'confirmed', 1, 0)), 2) as confirmation_rate
FROM Signups s LEFT JOIN Confirmations c
    USING(user_id)
GROUP BY user_id;