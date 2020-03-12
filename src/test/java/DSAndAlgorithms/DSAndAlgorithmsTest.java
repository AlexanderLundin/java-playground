package DSAndAlgorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class DSAndAlgorithmsTest {
    DSAndAlgorithms dsAndA = new DSAndAlgorithms();

    @Test
    public void TestSortArray() {
        //Setup
        String[] products = new String[]{"Zephyr" , "Magic Vest", "Old Staff", "Spurious Rock"};
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Magic Vest");
        expected.add("Old Staff");
        expected.add("Spurious Rock");
        expected.add("Zephyr");
        //Exercise
        ArrayList<String> actual = dsAndA.sortArray(products);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void TestGenHashMap() {
        //Setup
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(747, "Airplane");
        expected.put(10, "Laphroaig");
        //Exercise
        HashMap<Integer, String> actual = dsAndA.genHashMap();
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}