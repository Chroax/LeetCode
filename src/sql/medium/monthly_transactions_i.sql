-- @Link Problem : https://leetcode.com/problems/monthly-transactions-i
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 11:01 AM

SELECT DISTINCT DATE_FORMAT(trans_date, '%Y-%m') AS month,
    country,
    COUNT(state) AS trans_count,
    COUNT(CASE WHEN state = 'approved' THEN 1 END) AS approved_count,
    SUM(amount) AS trans_total_amount,
    IFNULL(SUM(CASE WHEN state = 'approved' THEN amount END),0) AS  approved_total_amount
FROM Transactions
GROUP BY month, country;