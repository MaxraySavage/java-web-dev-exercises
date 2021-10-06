package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    // Code to run before each test
    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,0.001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        //assertFalse(test_car.getGasTankLevel() == 0);
        //assertTrue(test_car.getGasTankLevel() == 10);

        assertEquals("Constructed car has correct initial gas tank value",10, test_car.getGasTankLevel(), 0.001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals("gasTankLevel is accurate after driving within tank range", 9, test_car.getGasTankLevel(), 0.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange(){
        // drive 100 miles more than current range
        double miles = test_car.getMilesPerGallon() * test_car.getGasTankLevel() + 100;
        test_car.drive(miles);
        assertEquals("gasTankLevel is accurate after attempting to drive beyond tank range", 0, test_car.getGasTankLevel(), 0.001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void TestGasOverfillException() {
        String message = "";
        test_car.addGas(5);
        fail("Should've already hit an error when we added gas so if this line runs, we have failed the test");
    }

}
