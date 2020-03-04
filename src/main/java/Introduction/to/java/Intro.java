package Introduction.to.java;

public class Intro {

    boolean IsActive(String status) {
        // Implement your solution
        if (status.equals("active")){
            return true;
        }
        return false;
    }

    String Grade(int input) {
        String grade = "";
        if (input <= 59){
            grade = "F";
        } else if (input <= 69){
            grade = "D";
        } else if (input <= 79){
            grade = "C";
        } else if (input <= 89){
            grade = "B";
        } else if (input <= 100){
            grade = "A";
        }
        return grade;
    }

    public boolean WhileLoopPrinter() {
        int i = 45;
        while (i < 51) {
            System.out.println(i);
            i++;
        }
        return true;
    }

    public boolean ForLoopPrinter() {
        for (int i = 2; i < 7; i = i + 2) {
            System.out.println(i);
        }
        return true;
    }
}
