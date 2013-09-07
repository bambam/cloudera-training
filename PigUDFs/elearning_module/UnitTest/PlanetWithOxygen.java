package myudfs;

import java.io.IOException;

import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanetWithOxygen extends FilterFunc {
    public Boolean exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0)
            return null;
        try {
            String value = (String) input.get(0);
            return (value.indexOf("oxygen") >= 0);
        } catch (Exception ee) {
            throw new IOException("Caught exception processing input row ", ee);
        }
    }

    @Test
    public void testThis() throws IOException {

        // Create tuple with two fields in it
        Tuple oxygenTuple = TupleFactory.getInstance().newTuple(2);
        oxygenTuple.set(0, "oxygen");
        oxygenTuple.set(1, "something");

        PlanetWithOxygen pwo = new PlanetWithOxygen();
        assertTrue(pwo.exec(oxygenTuple));

        Tuple notOxygenTuple = TupleFactory.getInstance().newTuple(2);
        notOxygenTuple.set(0, "hydrogen");
        notOxygenTuple.set(1, "something");
        assertFalse(pwo.exec(notOxygenTuple));

    }
}