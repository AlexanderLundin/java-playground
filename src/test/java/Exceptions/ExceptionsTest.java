package Exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsTest {
    @Test
    public void TestRiskyProcess() throws Exception {
        //Setup
        int input = 1;
        RiskyProcess riskyProcess = new RiskyProcess();
        //Exercise
        try{
            riskyProcess.run(input);
        }catch(NullPointerException e){
            System.out.println("encountered null pointer");
        }catch(IndexOutOfBoundsException e){
            System.out.println("index out of bounds");
        }catch(Exception e){
            System.out.println("Exception occurred");
        }finally {
            System.out.println("Done"); // always print this, no matter what
        }
        //Assert
        //Teardown
    }
}