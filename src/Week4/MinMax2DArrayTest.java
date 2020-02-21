package Week4;

import org.junit.Test;

import static Week4.MinMax2DArray.array2DMax;
import static Week4.MinMax2DArray.array2DMin;
import static org.junit.Assert.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 21/02/2020
*/
public class MinMax2DArrayTest {

    // Array for testing purposes
    int[][] testArray = {{1,2,3},{4,5,6},{7,8,9}};

    @Test(timeout = 1)
    public void FindingMax() {
        // Using array2dMax to find largest number
        MinMax2DArray rt = new MinMax2DArray();
        assertEquals(9, rt.array2DMax(testArray));
    }

    @Test(timeout = 1)
    public void FindingMin() {
        // Using array2D min to find smallest number
        MinMax2DArray rt = new MinMax2DArray();
        assertEquals(1, rt.array2DMin(testArray));
    }

    @Test
    public void FindingSumOfRow() {
        // Testing adding up a row (using first row)
        MinMax2DArray rt = new MinMax2DArray();
        assertEquals(6, rt.rowSum(testArray, 0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void OutOfBoundsIndexOnSum() {
        // Testing adding up a row, with a row index larger than range
        MinMax2DArray rt = new MinMax2DArray();
        assertEquals(6, rt.rowSum(testArray, 4));
    }

}