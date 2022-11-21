/* Write your PL/SQL query statement below */
SELECT employee_id, case when mod(employee_id, 2)=1 AND name not like 'M%' then salary else 0
end as bonus
from Employees
order by employee_id
