package isp.lab3.exercise4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MyPointTest {
    @Test
            public void PointTest() {
        MyPoint p1 = new MyPoint(5, 10, 10);
        MyPoint p2 = new MyPoint(5, 10, 5);
        int expected = 5;
        double actual = p1.distance(p2);

        assertEquals(expected, p1.distance(p2),0);
    }
}
