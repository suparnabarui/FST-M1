-- Activity 1 : Create the Salesman table 
CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20),salesman_city varchar2(20),commission int);
DESCRIBE salesman;

-- Activity 2: insert into table 
INSERT ALL
    INTO salesman VALUES (5001, 'James Hoog', 'New York', 15)
    INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13)
    INTO salesman VALUES (5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES (5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM dual;
--to display all the rows
Select * from Salesman;

--Activity 3:display data from salesman table

--Show data from the salesman_id and salesman_city columns
SELECT salesman_id, salesman_city FROM salesman;
--Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city = 'Paris';
--Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

--Activity 4 : Add a new column
ALTER TABLE salesman ADD (grade int);
UPDATE salesman SET grade = 100;

--Activity 5 --In this activity we will be updating the data in the salesman table.

--Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade = 200 WHERE salesman_city = 'Rome';

--Update the grade score of James Hoog to 300.
UPDATE salesman SET grade = 300 WHERE salesman_name = 'James Hoog';

--Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name = 'Pierre' WHERE salesman_name = 'McLyon';



