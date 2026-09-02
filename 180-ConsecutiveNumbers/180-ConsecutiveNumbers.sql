-- Last updated: 02/09/2026, 09:55:34
# Write your MySQL query statement below
with cte as (
    select num,
    lead(num,1) over() num1,
    lead(num,2) over() num2
    from logs
)
select distinct num ConsecutiveNums from cte where (num=num1) and (num=num2)