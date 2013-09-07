#!/usr/bin/python
@outputSchema("record: {(rank:int, name:chararray, stackrank:double, department:chararray)}")
def enumerate_bag(input):
    output = []
    for rank, item in enumerate(input):
        output.append(tuple([rank] + list(item)))
    return output