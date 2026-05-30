# Write your MySQL query statement below
select employeeuni.unique_id,employees.name from employees left join employeeUni on employees.id=employeeuni.id 