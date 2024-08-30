# Write your MySQL query statement below
Select A.id From Weather A ,Weather B Where DATEDIFF(A.recordDate ,B.recordDate) = 1 AND A.temperature > B.temperature ;