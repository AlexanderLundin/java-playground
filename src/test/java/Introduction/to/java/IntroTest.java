package Introduction.to.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public final class IntroTest {
    Intro intro;
    @Before
    public void Setup(){
        //Setup
        intro = new Intro();
    }
    @Test
    public void TestIsActive() {
        //Setup
        //Exercise
        boolean isActive = intro.IsActive("active");
        //Assert
        assertTrue(isActive);
        //Teardown
    }

    @Test
    public void TestGrade (){
        //Setup
        //Exercise
        String grade = intro.Grade(50);
        //Assert
        assertEquals(grade ,"F");
        //Teardown
     }

    @Test
    public void TestWhileLoopPrinter() {
        //Setup
        //Exercise
        boolean loopExecuted = intro.WhileLoopPrinter();
        //Assert
        assertTrue(loopExecuted);
        //Teardown
    }

    @Test
    public void TestForLoopPrinter() {
        //Setup
        //Exercise
        boolean loopExecuted = intro.ForLoopPrinter();
        //Assert
        assertTrue(loopExecuted);
        //Teardown
    }
}