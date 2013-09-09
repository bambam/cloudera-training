REGISTER '/home/cloudera/PigUDFs/rankudf.py' using jython as myudf;
employees = LOAD 'employees' USING PigStorage(',') as (name:chararray, stackrank:double, department:chararray);
employees_by_department = group employees by department;
result = foreach employees_by_department {
           sorted = order employees by stackrank desc;
           ranked = myudf.enumerate_bag(sorted);
           generate flatten(ranked);
        };
dump result;