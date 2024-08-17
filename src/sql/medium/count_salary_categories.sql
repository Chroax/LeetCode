-- @Link Problem : https://leetcode.com/problems/count-salary-categories
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 05:05 PM

WITH CategorizedAccount AS(
    SELECT account_id,
        CASE
            WHEN income < 20000 THEN 'Low Salary'
            WHEN income >= 20000 AND income <= 50000 THEN 'Average Salary'
            ELSE 'High Salary'
        END AS category
    FROM Accounts
)

SELECT 'High Salary' as category,
    COUNT(account_id) as accounts_count
FROM CategorizedAccount
WHERE category = 'High Salary'
UNION
SELECT 'Low Salary' as category,
    COUNT(account_id) as accounts_count
FROM CategorizedAccount
WHERE category = 'Low Salary'
UNION
SELECT 'Average Salary' as category,
    COUNT(account_id) as accounts_count
FROM CategorizedAccount
WHERE category = 'Average Salary';