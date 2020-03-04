package Introduction.to.java;

import org.junit.After;
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
        boolean isActive = intro.isActive("active");
        //Assert
        assertTrue(isActive);
        //Teardown
    }

    @Test
    public void TestGrade (){
        //Setup
        //Exercise
        String grade = intro.grade(50);
        //Assert
        assertEquals(grade ,"F");
        //Teardown
     }
}