-- @Link Problem : https://leetcode.com/problems/recyclable-and-low-fat-products
-- @Contributor  : Chroax
-- @Created at   : 15 August 2024, 06:45 PM

SELECT product_id
FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';