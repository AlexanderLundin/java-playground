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

    @Test
    public void TestToSentenceEmptyString() {
        //Setup
        String[] inputArray = new String[]{""};
        //Exercise
        String expected = "";
        String actual = dsAndA.toSentence(inputArray);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void TestToSentenceEmptyArray() {
        //Setup
        String[] inputArray = new String[]{};
        //Exercise
        String expected = "";
        String actual = dsAndA.toSentence(inputArray);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void TestToSentenceValidArray() {
        //Setup
        String[] inputArray = new String[]{"Alice", "Bob"};
        //Exercise
        String expected = "Alice and Bob";
        String actual = dsAndA.toSentence(inputArray);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void TestToSentenceValidArray2() {
        //Setup
        String[] inputArray = new String[]{"Alice", "Bob", "Carol"};
        //Exercise
        String expected = "Alice, Bob and Carol";
        String actual = dsAndA.toSentence(inputArray);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}