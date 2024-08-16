-- @Link Problem : https://leetcode.com/problems/product-sales-analysis-i
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 07:10 PM

SELECT p.product_name, s.year, s.price
FROM Sales s JOIN Product p
    USING(product_id);