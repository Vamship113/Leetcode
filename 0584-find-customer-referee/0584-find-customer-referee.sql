# Write your MySQL query statement below
select NAME
from customer
WHERE referee_id IS NULL OR referee_id != 2;