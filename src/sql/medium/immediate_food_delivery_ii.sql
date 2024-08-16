-- @Link Problem : https://leetcode.com/problems/immediate-food-delivery-ii
-- @Contributor  : Chroax
-- @Created at   : 16 August 2024, 11:33 AM

SELECT
    ROUND(AVG(IF(d.order_date = d.customer_pref_delivery_date, 1, 0)) * 100, 2) AS immediate_percentage
FROM Delivery d JOIN (
    SELECT customer_id,
        MIN(order_date) AS min_order_date
    FROM Delivery
    GROUP BY customer_id
) AS sub
    ON d.customer_id = sub.customer_id
    AND d.order_date = sub.min_order_date
ORDER BY d.order_date;
