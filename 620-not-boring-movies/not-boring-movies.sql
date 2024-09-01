# Write your MySQL query statement below
Select id , movie,description ,rating
FROM Cinema 
WHERE (MOD(id,2)!= 0) AND 
description != "boring"
Order by rating DESC 