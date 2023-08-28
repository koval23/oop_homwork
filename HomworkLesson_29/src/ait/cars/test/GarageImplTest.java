package ait.cars.test;

import ait.cars.dao.GarageImpl;
import ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class GarageImplTest {
    GarageImpl garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[]{
                new Car("ABC123", "Model1", "Company1", 2.0, "Blue"),
                new Car("DEF456", "Model1", "Company2", 1.5, "Blue"),
                new Car("GHI789", "Model3", "Company3", 2.5, "Green"),
                new Car("JKL012", "Model4", "Company3", 1.8, "Black"),
        };
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertTrue(garage.addCar(cars[0]));
        assertFalse(garage.addCar(cars[0]));
        Car car1 = new Car("AZC123", "Model1", "Company1", 2.0, "Red");
        assertFalse(garage.addCar(car1));

    }

    @Test
    void removeCar() {
        assertEquals(cars[0], garage.removeCar(cars[0].getRegNumber()));
        assertNull(garage.removeCar(cars[0].getRegNumber()));
    }

    @Test
    void findCarByRegNumber() {
        assertEquals(cars[1], garage.findCarByRegNumber(cars[1].getRegNumber()));
        assertNull(garage.findCarByRegNumber("AZC128"));
    }

    @Test
    void findCarsByModel() {
        Car[] actual = garage.findCarsByModel("Model1");
        Car[] expected = {cars[0], cars[1]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByModel("Company3");
        Car[] expected = {cars[2], cars[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByColor("Blue");
        Car[] expected = {cars[0], cars[1]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(2.0, 3.0);
        Car[] expected = {cars[0], cars[2]};
        assertArrayEquals(expected, actual);
    }
}