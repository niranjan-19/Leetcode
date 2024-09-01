# Write your MySQL query statement below
select t1.product_id , ifnull(round(sum(price*units)/sum(units),2),0) as average_price 
from Prices t1 
left join UnitsSold t2 on t1.product_id = t2.product_id
and t2.purchase_date  between t1.start_date and t1.end_date
group by t1.product_id

