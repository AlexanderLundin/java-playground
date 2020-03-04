package Introduction.to.java;

public class Intro {

    boolean isActive(String status) {
        // Implement your solution
        if (status.equals("active")){
            return true;
        }
        return false;
    }

    String grade(int input) {
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

}
