-- @Link Problem : https://leetcode.com/problems/product-price-at-a-given-date
-- @Contributor  : Chroax
-- @Created at   : 17 August 2024, 04:02 PM

WITH TotalProduct AS(
    SELECT product_id,
        MAX(change_date) as max_date
    FROM Products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
), LatestPrice AS(
    SELECT p.product_id,
        new_price
    FROM Products p
    INNER JOIN TotalProduct tp
        ON p.product_id = tp.product_id
        AND p.change_date = tp.max_date
)
SELECT product_id,
    COALESCE(lp.new_price, 10) AS price
FROM Products p
LEFT JOIN LatestPrice lp
    USING(product_id)
GROUP BY product_id;