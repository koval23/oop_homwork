package ait.computerStock.dao;

import ait.computerStock.model.Computer;

import java.util.function.Predicate;

public class ComputerStockImpl implements ComputerStock {
    Computer[] computers;
    private int size;

    public ComputerStockImpl(int capasity) {
        computers = new Computer[capasity];
    }

    @Override
    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputerById(computer.getId()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    @Override
    public Computer removeComputer(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {
                Computer removeComputer = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                return removeComputer;
            }
        }
        return null;
    }

    @Override
    public Computer[] findComputerByModel(String model) {
        Predicate<Computer> predicate = computer -> computer.getModel().equals(model);
        return findComputerByPredicate(predicate);
    }

    @Override
    public Computer[] findComputerByProcessor(String processor) {
        Predicate<Computer> predicate = computer -> computer.getProcessor().equals(processor);
        return findComputerByPredicate(predicate);
    }

    @Override
    public Computer[] findComputerByRam(String ram) {
        Predicate<Computer> predicate = computer -> computer.getRam().equals(ram);
        return findComputerByPredicate(predicate);
    }

    @Override
    public Computer findComputerById(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private Computer[] findComputerByPredicate(Predicate<Computer> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(computers[i])) {
                count++;
            }
        }
        Computer[] resArrComputer = new Computer[count];
        for (int i = 0, j = 0; i < size; i++) {
            if (predicate.test(computers[i])) {
                resArrComputer[j] = computers[i];
                j++;
            }
        }
        return resArrComputer;
    }
}
