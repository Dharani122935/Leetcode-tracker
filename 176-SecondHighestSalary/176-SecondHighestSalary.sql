-- Last updated: 02/09/2026, 09:55:52
# Write your MySQL query statement below
select max(salary) as secondhighestsalary
from employee
where salary <(select max(salary) from employee);