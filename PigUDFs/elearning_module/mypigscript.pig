REGISTER '/com/exploration/pig/myudfs.jar';
planets = LOAD 'planets' USING PigStorage(',') AS (planet:chararray, star:chararray, atmosphere:chararray, distance:double);
result = FILTER planets BY myudfs.PlanetWithOxygen(atmosphere) AND myudfs.DistanceFromEarth(distance);
DUMP result;