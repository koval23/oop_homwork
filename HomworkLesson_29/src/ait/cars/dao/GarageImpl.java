package ait.cars.dao;

import ait.cars.model.Car;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size = 0;

    // Конструктор, создает массив cars заданной вместимости
    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    // Добавляет car в гараж
    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length) {  // Проверка на null и переполнение гаража
            return false;
        }
        cars[size] = car;  // Добавляем car в массив
        size++;
        return true;
    }

    // Удаляет car из гаража по номеру регистрации
    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {  // Используем equals для сравнения строк
                Car removedCar = cars[i];  // Запоминаем удаляемый автомобиль
                cars[i] = cars[size - 1];  // Заменяем удаляемый автомобиль последним в массиве
                size--;
                return removedCar;
            }
        }
        return null;  // Автомобиль не найден
    }

    // Находит car по номеру регистрации
    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;  // Автомобиль не найден
    }

    // Находит автомобили по модели
    @Override
    public Car[] findCarsByModel(String model) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getModel().equals(model)) {
                count++;
            }
        }
        Car[] carsByModel = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (cars[i].getModel().equals(model)) {
                carsByModel[j] = cars[i];
                j++;
            }
        }
        return carsByModel;
    }

    // Находит автомобили по компании
    @Override
    public Car[] findCarsByCompany(String company) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getCompany().equals(company)) {
                count++;
            }
        }
        Car[] carsByCompany = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (cars[i].getCompany().equals(company)) {
                carsByCompany[j] = cars[i];
                j++;
            }
        }
        return carsByCompany;
    }

    // Находит автомобили по цвету
    @Override
    public Car[] findCarsByColor(String color) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getColor().equals(color)) {
                count++;
            }
        }
        Car[] carsByColor = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (cars[i].getColor().equals(color)) {
                carsByColor[j] = cars[i];
                j++;
            }
        }
        return carsByColor;
    }

    // Находит автомобили по диапазону мощности двигателя
    @Override
    public Car[] findCarsByEngine(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getEngine() > min && cars[i].getEngine() < max) {
                count++;
            }
        }
        Car[] carsByEngine = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (cars[i].getEngine() > min && cars[i].getEngine() < max) {
                carsByEngine[j] = cars[i];
                j++;
            }
        }
        return carsByEngine;
    }
}
