# Write your MySQL query statement below
Select a.machine_id , round(
    (select avg(a1.timestamp)FROM Activity a1 Where activity_type='end' and a1.machine_id=a.machine_id ) 
    -
    (select avg(a1.timestamp)FROM Activity a1 Where activity_type='start' and a1.machine_id=a.machine_id), 3) as processing_time  From Activity a Group by a.machine_id