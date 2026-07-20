# Write your MySQL query statement below
# here the managerId represents the id of the employee in the same table 

SELECT e.name as Employee 
from Employee e
INNER JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;
