--Activity 9 ---
-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

--Write an SQL statement to know which salesman are working for which customer.
SELECT s.salesman_id, s.salesman_name, c.customer_id, c.customer_name
FROM salesman s
JOIN customers c ON s.salesman_id = c.salesman_id;
--Write an SQL statement to make a list of customers in ascending order with a salesman that have a grade less than 300.
SELECT c.customer_id, c.customer_name, c.grade, s.salesman_name, s.grade AS salesman_grade
FROM customers c
JOIN salesman s ON c.salesman_id = s.salesman_id
WHERE s.grade < 300
ORDER BY c.customer_name ASC;

--Write an SQL statement to find the list of customers who appointed a salesman who gets a commission of more than 12%.
SELECT c.customer_id, c.customer_name, s.salesman_id, s.salesman_name, s.commission
FROM customers c
JOIN salesman s ON c.salesman_id = s.salesman_id
WHERE s.commission > 12;

--Write an SQL statement to find the following details of an order - order number, order date, purchase amount of order, which customer gives the order and which salesman works for that customer and commission rate they get for the order.
    SELECT 
    o.order_no, 
    o.order_date, 
    o.purchase_amount, 
    c.customer_name, 
    s.salesman_name, 
    s.commission
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
JOIN salesman s ON o.salesman_id = s.salesman_id;

--Activity 10 --
--In this activity we will using the salesman, orders, and the customers table to perform Subquery operations on both tables.
--Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007.
SELECT *
FROM orders
WHERE salesman_id = (
    SELECT salesman_id
    FROM customers
    WHERE customer_id = 3007
);
--Write a query to find all orders attributed to a salesman in New York.
SELECT *
FROM orders
WHERE salesman_id IN (
    SELECT salesman_id
    FROM salesman
    WHERE salesman_city = 'New York'
);
--Write a query to count the customers with grades above New York's average.
SELECT COUNT(*) AS customers_above_avg_grade
FROM customers
WHERE grade > (
    SELECT AVG(grade)
    FROM customers
    WHERE city = 'New York'
);
--Write a query to extract the data from the orders table for those salesman who earned the maximum commission
SELECT *
FROM orders
WHERE salesman_id IN (
    SELECT salesman_id
    FROM salesman
    WHERE commission = (
        SELECT MAX(commission)
        FROM salesman
    )
);
--Activity 11
--Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order.
SELECT s.salesman_name, s.salesman_id, COUNT(o.order_no) AS order_count
FROM salesman s
JOIN orders o ON s.salesman_id = o.salesman_id
GROUP BY s.salesman_name, s.salesman_id
HAVING COUNT(o.order_no) > 1

UNION ALL

SELECT c.customer_name, c.customer_id, COUNT(o.order_no) AS order_count
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_name, c.customer_id
HAVING COUNT(o.order_no) > 1

ORDER BY 1;  -- Orders alphabetically by name

--Write a query to make a report of which salesman produce the largest and smallest orders on each date. Also add a column that shows "highest on" and "lowest on" values.
SELECT 
    order_date,
    salesman_id,
    purchase_amount,
    CASE 
        WHEN purchase_amount = daily_max THEN 'highest on'
        WHEN purchase_amount = daily_min THEN 'lowest on'
        ELSE NULL
    END AS order_type
FROM (
    SELECT
        order_date,
        salesman_id,
        purchase_amount,
        MAX(purchase_amount) OVER (PARTITION BY order_date) AS daily_max,
        MIN(purchase_amount) OVER (PARTITION BY order_date) AS daily_min
    FROM orders
)
WHERE purchase_amount = daily_max OR purchase_amount = daily_min
ORDER BY order_date, order_type DESC;
