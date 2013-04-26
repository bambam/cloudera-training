------------
UDFs in Hive
------------

Hello and welcome. This archive contains an exercise for you to complete in conjunction with the "Writing UDFs in Hive" e-learning module. The files in this archive are:

Hive UDFs/README
Hive UDFs/subscribers.txt
Hive UDFs/Unix2Date.java
Hive UDFs/sample_solution/Unix2Date.java
Hive UDFs/sample_solution/solution.txt

The subscribers.txt file is similar to the dataset shown in the e-learning module (with some additional data). You can use this dataset to create a sample table in Hive. The Unix2Date.java file is a 'stub' file to get you started. Any time you want, you can always use the Unix2Date.java file in the sample_solution directory to see one possible solution. Lastly, the solution.txt file shows the entire end-to-end process used to complete the exercise, as described in the e-learning module.

--------
Exercise
--------

In this exercise, you will create a UDF that will convert unixtime to a regular time date format. This UDF can then be used to quickly determine when subscribers were provisioned by returning a human-readable date.

------------
Instructions
------------

The end-to-end process is the following:

1. Create a table in Hive corresponding to the schema in sample_dataset.txt
2. Load the sample_dataset.txt into the table you created in step #1
3. Write the custom UDF
4. Compile the UDF
5. Create the jar file for the UDF
4. Add the jar file to the classpath of Hive
5. Register your Custom UDF
6. In the Hive shell, execute your custom UDF by invoking it inside a Hive query

NOTE: These steps are all covered in the "Writing UDFs in Hive" e-learning module if you need to review them. Alternately, you can view the solution.txt file to see what was used to complete this particular exercise.






