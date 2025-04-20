-- 1
select *
from product
where category in ('Electronics', 'Gaming', 'Computers');

-- 2
SELECT 
    *
FROM
    product
WHERE
    name LIKE 'A%';


-- 3
select count(id)
from user
where status = "active";

-- 4
select count(*)
from product
where stock <= 0;

-- 5
select *
from product
order by price desc
limit 10;

