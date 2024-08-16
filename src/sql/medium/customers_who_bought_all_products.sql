-- @Link Problem : https://leetcode.com/problems/customers-who-bought-all-products
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 04:26 PM

WITH TotalProduct AS (
    SELECT COUNT(*) AS total_product
    FROM Product
), CustomerProduct AS (
    SELECT c.customer_id,
        COUNT(DISTINCT p.product_key) AS purchased_products
    FROM Customer c
    INNER JOIN Product p ON c.product_key = p.product_key
    GROUP BY c.customer_id
)
SELECT c.customer_id
FROM CustomerProduct c
INNER JOIN TotalProduct tp
    ON c.purchased_products = tp.total_product;