package ait.cars.test;

import ait.cars.dao.GarageImpl;
import ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class GarageImplTest {
    GarageImpl garage; // Экземпляр тестируемой реализации интерфейса Garage
    Car[] cars; // Массив объектов Car для тестирования

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5); // Инициализация гаража перед каждым тестом
        cars = new Car[4];
        cars[0] = new Car("ABC123", "Model1", "Company1", 2.0, "Blue");
        cars[1] = new Car("DEF456", "Model1", "Company2", 1.5, "Blue");
        cars[2] = new Car("GHI789", "Model3", "Company3", 2.5, "Green");
        cars[3] = new Car("JKL012", "Model4", "Company3", 1.8, "Black");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]); // Добавление тестовых машин в гараж
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null)); // Попытка добавить null-автомобиль, должен вернуться false
        assertTrue(garage.addCar(cars[0])); // Добавление первой машины, должен вернуться true
        assertFalse(garage.addCar(cars[0])); // Добавление той же машины снова, должен вернуться false
        Car car1 = new Car("AZC123", "Model1", "Company1", 2.0, "Red");
        assertFalse(garage.addCar(car1)); // Попытка добавить машину при полном гараже, должен вернуться false
    }

    @Test
    void removeCar() {
        assertEquals(cars[0], garage.removeCar(cars[0].getRegNumber())); // Удаление первой машины
        assertNull(garage.removeCar(cars[0].getRegNumber())); // Попытка удалить уже удаленную машину
    }

    @Test
    void findCarByRegNumber() {
        assertEquals(cars[1], garage.findCarByRegNumber(cars[1].getRegNumber())); // Поиск машины по номеру
        assertNull(garage.findCarByRegNumber("AZC128")); // Поиск машины по несуществующему номеру
    }

    @Test
    void findCarsByModel() {
        Car[] actual = garage.findCarsByModel("Model1"); // Поиск машин по модели
        Car[] expected = {cars[0], cars[1]}; // Ожидаемый результат
        assertArrayEquals(expected, actual); // Сравнение ожидаемого и фактического массивов
    }

    @Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByCompany("Company3"); // Поиск машин по компании
        Car[] expected = {cars[2], cars[3]}; // Ожидаемый результат
        assertArrayEquals(expected, actual); // Сравнение ожидаемого и фактического массивов
    }

    @Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByColor("Blue"); // Поиск машин по цвету
        Car[] expected = {cars[0], cars[1]}; // Ожидаемый результат
        assertArrayEquals(expected, actual); // Сравнение ожидаемого и фактического массивов
    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(2.0, 3.0); // Поиск машин по диапазону мощности двигателя
        Car[] expected = {cars[0], cars[2]}; // Ожидаемый результат
        assertArrayEquals(expected, actual); // Сравнение ожидаемого и фактического массивов
    }
}
