package myudfs;
import java.io.IOException;
import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;

public class DistanceFromEarth extends FilterFunc {
   public Boolean exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0)
            return null;
        try {
           Object value = input.get(0);
           if (value instanceof Double)
              return ((Double)value).size() <5;
         } catch(Exception ee) {
           throw new IOException("Caught exception processing input row ", ee);
            }
    }
}