package Week5;

import org.junit.Test;

import static org.junit.Assert.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 21/02/2020
*/
public class StringArrayProcessingTest {

    String[][] test1 = {
            {"Jo", "John", "James"},
            {"Bob", "Jo", "Rob"},
            {"Kyle", "Lyle", "Richardo III"}
    };
    String[][] test2 = {
            {"Jo", "John", "James"},
            {"Bob", "Philip", "Rob"},
            {"Kyle", "Lyle", "Richardo III"},
    };

    @Test
    public void testDuplicateSearch() {
        StringArrayProcessing rc = new StringArrayProcessing();
        assertTrue(rc.duplicateSearch(test1));
        assertFalse(rc.duplicateSearch(test2));
    }
    @Test
    public void testNameSearch(){
        StringArrayProcessing rc = new StringArrayProcessing();
        assertTrue(rc.nameSearch(test2, "Philip"));
        assertFalse(rc.nameSearch(test1, "Philip"));
    }


}