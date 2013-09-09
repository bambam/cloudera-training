-- First register the function and specify 
REGISTER 
-- Next, load the employees.txt data that you already created in HDFS
employees = LOAD 'employees' USING PigStorage(',') as (name:chararray, stackrank:double, department:chararray);
-- now group and sort, calling the UDF that you wrote to stackrank
employees_by_department = group employees by department;
result = foreach employees_by_department {
        };
dump result;