package DSAndAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class DSAndAlgorithms {
    public ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> sortedList = new ArrayList<>();
        for (int i = 0; i < inputArray.length ; i++){
            sortedList.add(inputArray[i]);
        }
        sortedList.sort(null);
        return sortedList;

    }

    public HashMap<Integer, String> genHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(747, "Airplane");
        hashMap.put(10, "Laphroaig");
        return hashMap;
    }

    public String toSentence(String[] inputArray) {
        String sentence = "";
        int index = 0;
        for (String word: inputArray){
            if (index == 0){
                sentence += word;
            } else if (index == (inputArray.length - 1)){
                sentence += " and " + word;
            }else{
                sentence += ", " + word;
            }
            index += 1;
        }
        return sentence;
    }
}
