package myudfs;
import java.io.*;
import java.io.IOException;
import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;

public class PlanetWithOxygen extends FilterFunc {
    public Boolean exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0)
            return null;
            try {
                String value = (String)input.get(0);
                return (value.indexOf("oxygen") >=0);
              } catch(Exception ee) {
                throw new IOException("Caught exception processing input row ", ee);
            }
    }
}