package Week5;

import org.junit.Test;

import static org.junit.Assert.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 21/02/2020
*/
public class RecursiveFormulaTest {


    @Test
    public void main() {
        RecursiveFormula rt = new RecursiveFormula();

        assertEquals(5,rt.secondRecursiveFormula(1));
        assertEquals(8, rt.secondRecursiveFormula(2));
    }
}