package Week5;

import org.junit.Test;

import static org.junit.Assert.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 21/02/2020
*/
public class ArraySumTest {

    int[] testArray = {1,2,3,4,5};
    @Test
    public void main() {
    }

    @Test(timeout = 5)
    public void sumArrayTest() {
        ArraySum rc = new ArraySum();
        assertEquals(15, rc.sumArray(testArray));
    }
}