-- @Link Problem : https://leetcode.com/problems/average-selling-price
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 09:30 AM

SELECT p.product_id,
        IFNULL(ROUND(SUM(p.price * us.units) / SUM(us.units), 2), 0) AS average_price
FROM Prices p LEFT JOIN UnitsSold us
    ON p.product_id = us.product_id
    AND us.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY product_id;