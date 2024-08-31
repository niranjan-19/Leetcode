# Write your MySQL query statement below
Select s.student_id , s.student_name , sub.subject_name , COUNT(E.student_id) AS attended_exams
From 
Students s CROSS JOIN Subjects sub LEFT JOIN   Examinations e ON  s.student_id = e.student_id AND  sub.subject_name = e.subject_name 
GROUP BY  s.student_id ,s.student_name, sub.subject_name
Order BY s.student_id, sub.subject_name