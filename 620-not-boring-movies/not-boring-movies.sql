# Write your MySQL query statement below
Select * 
FROM Cinema 
WHERE (MOD(id,2)!= 0) AND 
description != "boring"
Order by rating DESC 