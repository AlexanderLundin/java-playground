package DSAndAlgorithms;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DSAndAlgorithmsTest {
    DSAndAlgorithms dsAndG = new DSAndAlgorithms();

    @Test
    public void TestSort() {
        //Setup
        String[] products = new String[]{"Zephyr" , "Magic Vest", "Old Staff", "Spurious Rock"};
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Magic Vest");
        expected.add("Old Staff");
        expected.add("Spurious Rock");
        expected.add("Zephyr");
        //Exercise
        ArrayList<String> actual = dsAndG.sortArray(products);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}