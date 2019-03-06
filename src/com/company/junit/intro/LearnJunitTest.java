package junit.intro;

import org.junit.Assert;
import org.junit.Test;

public class LearnJunitTest {

    @Test
    public void testAssertArraysEqual(){
        byte[] actual = "test".getBytes();
        byte[] expected = "test".getBytes();
        Assert.assertArrayEquals("Arrays are equal", expected, actual);

    }

    @Test
    public void testAssertEqual(){
        Assert.assertEquals("Strings are equal", "hello", "prachi");

    }

    @Test
    public void testAssertFalse(){
        Assert.assertFalse("true", 1>9);

    }

    @Test
    public void testAssertNull(){
        Object obj = new Object();
        obj=null;
        Assert.assertNotNull(obj);

    }


}
