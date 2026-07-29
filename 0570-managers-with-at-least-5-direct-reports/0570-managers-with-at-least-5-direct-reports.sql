# Write your MySQL query statement below

select name from Employee 
where id IN (SELECT managerId from Employee group by managerId having count(*) >=5 )
