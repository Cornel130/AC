package isp.lab3.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
    @Test
    public void testGrow()
    {
        Tree a1=new Tree();
        assertEquals(15,a1.getHeight());
        a1.grow((5));
        assertEquals(20,a1.getHeight());
    }
}
