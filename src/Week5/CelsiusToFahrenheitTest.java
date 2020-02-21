package Week5;

import org.junit.Test;
import org.omg.CORBA.TIMEOUT;

import static Week5.CelsiusToFahrenheit.conversion;
import static org.junit.Assert.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 21/02/2020
*/
public class CelsiusToFahrenheitTest {

    @Test(timeout = 0)
    public void testCelsiusToFahrenheitFormula() {
        CelsiusToFahrenheit rt = new CelsiusToFahrenheit();

        assertEquals(89.6, conversion(32), 0.1);
    }
}