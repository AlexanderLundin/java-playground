package Classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void TestFoo() {
        //Setup
        Foo foo = new Foo();
        int expected = 0;
        int actual = foo.bar();
        //Exercise
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}