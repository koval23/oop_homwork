package ait.computerStock.dao;

import ait.computerStock.model.Computer;

public interface ComputerStock {
    boolean addComputer (Computer computer);
    Computer removeComputer(int id);
    Computer[] findComputerByModel(String model);
    Computer[] findComputerByProcessor(String processor);
    Computer[] findComputerByRam(String ram);
    Computer findComputerById(int id);
    int size();

}
