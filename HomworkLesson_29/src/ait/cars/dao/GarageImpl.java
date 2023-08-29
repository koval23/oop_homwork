package ait.cars.dao;

import ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size;

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

        Predicate<Car> predicate = e -> e.getModel().equals(model);
        return findCarsByPredicate(predicate);
    }

    // Находит автомобили по компании
    @Override
    public Car[] findCarsByCompany(String company) {
        ;
        Predicate<Car> predicate = e -> e.getCompany().equals(company);
        return findCarsByPredicate(predicate);
    }

    // Находит автомобили по цвету
    @Override
    public Car[] findCarsByColor(String color) {

        Predicate<Car> predicate = e -> e.getColor().equals(color);
        return findCarsByPredicate(predicate);
    }

    // Находит автомобили по диапазону мощности двигателя
    @Override
    public Car[] findCarsByEngine(double min, double max) {

        Predicate<Car> predicate = e -> e.getEngine() > min && e.getEngine() < max;
        return findCarsByPredicate(predicate);
    }

    //    ==========================================

    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                count++;
            }
        }
        Car[] carsByEngine = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                carsByEngine[j] = cars[i];
                j++;
            }
        }
        return carsByEngine;
    }
}
