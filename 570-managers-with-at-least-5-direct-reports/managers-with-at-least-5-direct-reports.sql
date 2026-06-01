# Write your MySQL query statement below
select n1.name from employee n1 join employee n2 on n1.id=n2.managerid group by n1.id having count(n1.id)>=5;