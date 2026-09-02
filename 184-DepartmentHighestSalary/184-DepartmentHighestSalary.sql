-- Last updated: 02/09/2026, 09:55:32
# Write your MySQL query statement below
SELECT t2.name as Department,
t1.name as Employee ,Salary
FROM Employee t1
JOIN Department t2
ON t1.departmentId = t2.id
WHERE t1.salary=(select max(salary) from Employee where departmentId = t2.id);