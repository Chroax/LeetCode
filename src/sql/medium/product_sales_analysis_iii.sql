-- @Link Problem : https://leetcode.com/problems/product-sales-analysis-iii
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 02:55 PM

WITH FirstProduct AS(
    SELECT product_id,
        MIN(year) AS first_year
    FROM Sales
    GROUP BY product_id
)
SELECT s.product_id,
    fp.first_year,
    s.quantity,
    s.price
FROM Sales s
INNER JOIN FirstProduct fp
    ON s.product_id = fp.product_id
    AND s.year = fp.first_year