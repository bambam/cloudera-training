#!/usr/bin/python
# declare your input
# this is an evalfunc, which takes one record, so define a record to contain a bag of records, 
# corresponding to a row from 'employees' dataset
@outputSchema
def enumerate_bag(input):
    output = []
# return tuple, append to list, and return output