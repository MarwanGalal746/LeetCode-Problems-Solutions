/* Write your PL/SQL query statement below */
select name AS Customers
from   Customers
WHERE id NOT IN (
select customerId FROM Orders
)
