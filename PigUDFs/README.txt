-----------
UDFs in Pig
-----------

Hello and welcome. This archive contains 1.) an exercise for you to complete in conjunction with the "Writing UDFs in Pig" e-learning module, and 2.) source files from the demonstration in the "Writing UDFs in Pig" module. The exercise files in this archive are:

PigUDFs/README
PigUDFs/employees.txt
PigUDFs/rankudf.py
PIGUDFs/myscript.pig
PigUDFs/sample_solution/rankudf.py
PigUDFs/sample_solution/myscript.pig
PigUDFs/sample_solution/PigUDF_log4j.properties
PigUDFs/sample_solution/solution.txt

...and the source files from the e-learning module are:

PigUDFs/elearning_module/mypigscript.pig
PigUDFs/elearning_module/planets.txt
PigUDFs/elearning_module/DistanceFromEarth.java
PigUDFs/elearning_module/PlanetWithOxygen.java
PigUDFs/elearning_module/UnitTest/PlanetWithOxygen.java

----------------
Student Exercise
----------------

The employees.txt file is a dataset that will be used for the exercise.
The ~/PigUDFs/rankudf.py file is a 'stub' Python UDF to get you started. 
The ~/PigUDFs/myscript.pig is a 'stub' Pig script you will invoke on the command line to invoke the Python UDF. 

Any time you want, you can always use the rankudf.py and myscript.pig files in the sample_solution directory to see one possible solution. The PigUDF_log4j.properties file is optionally available if you want to suppress informational logging.

Lastly, the solution.txt file shows the entire end-to-end process used to complete the exercise, as demonstrated in the e-learning module.

--------
Exercise
--------

In this exercise, you will create a Pig UDF in Python that will order performance review data. The dataset (employees.txt) contains the following fields: name, stackrank, and department. Our job is to sort employees by stackranking them and sorting them by department.

------------
Instructions
------------

The end-to-end process is the following:

1. Create Python UDF
2. Write Pig script that will call the UDF
3. Run Pig script at the command-line

NOTE: These steps are all covered in the "Writing UDFs in Pig" e-learning module if you need to review them. Alternately, you can view the solution.txt file to see what was used to complete this particular exercise.