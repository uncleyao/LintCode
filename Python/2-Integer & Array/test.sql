-- write your code in SQLite 3.11.0
select
b.id as id,  COALESCE (t3.passengers_on_board,0) as passengers_on_board
from buses b
LEFT JOIN 
(
select t1.b_id, count(t1.p_id) as passengers_on_board from (
SELECT 
p.id as p_id, b.id as b_id, b.time as b_time
from passengers AS p
JOIN buses AS b
ON b.origin = p.origin AND b.destination = p.destination 
AND p.time<=b.time) as t1
JOIN (
SELECT 
p.id as p_id, b.id as b_id, MIN(b.time) as b_min_time
from buses AS b JOIN passengers AS p
ON b.origin = p.origin AND b.destination = p.destination 
AND p.time<=b.time
GROUP BY p_id, b_id) as t2
on t1.p_id = t2.p_id and t1.b_id = t2.b_id and t1.b_time = t2.b_min_time
group by t1.b_id) as t3
on b.id = t3.b_id
order by b.id;