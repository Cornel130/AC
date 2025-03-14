package isp.lab3.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void testString() {
        Vehicle vehicle = new Vehicle("Dacia", "Logan", 150, 'B');
        String expected = "Dacia(Logan) speed 150 fuelType=B";
        String actual = vehicle.toString();
        assertEquals(expected, actual);
    }
}
