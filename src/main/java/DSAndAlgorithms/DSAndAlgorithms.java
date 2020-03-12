package DSAndAlgorithms;

import java.util.ArrayList;

public class DSAndAlgorithms {
    public ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> sortedList = new ArrayList<>();
        for (int i = 0; i < inputArray.length ; i++){
            sortedList.add(inputArray[i]);
        }
        sortedList.sort(null);
        return sortedList;

    }
}
