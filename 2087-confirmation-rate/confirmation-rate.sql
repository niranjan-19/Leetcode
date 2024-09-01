# Write your MySQL query statement below
Select s.user_id , ROUND(avg(if(c.action="confirmed",1,0)), 2) AS  confirmation_rate
FROM Signups AS s LEFT JOIN Confirmations AS c 
ON 
s.user_id = c.user_id 
Group BY user_id ;