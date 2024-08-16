-- @Link Problem : https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:13 PM

SELECT v.customer_id,
    COUNT(*) AS count_no_trans
FROM Visits v LEFT JOIN Transactions t
    ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;