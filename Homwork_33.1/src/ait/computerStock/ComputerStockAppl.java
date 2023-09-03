package ait.computerStock;

import ait.computerStock.dao.ComputerStockImpl;
import ait.computerStock.model.Computer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ComputerStockAppl {
    public static void main(String[] args) {
        ComputerStockImpl computerStock = new ComputerStockImpl(100);

        Computer[] computersArr = new Computer[10];

        computersArr[0] = new Computer("Model 1", "Processor 1", "RAM 9", 1);
        computersArr[1] = new Computer("Model 2", "Processor 2", "RAM 2", 2);
        computersArr[2] = new Computer("Model 3", "Processor 3", "RAM 3", 3);
        computersArr[3] = new Computer("Model 3", "Processor 2", "RAM 3", 4);
        computersArr[4] = new Computer("Model 5", "Processor 2", "RAM 4", 5);
        computersArr[5] = new Computer("Model 3", "Processor 2", "RAM 3", 6);
        computersArr[6] = new Computer("Model 7", "Processor 5", "RAM 3", 7);
        computersArr[7] = new Computer("Model 8", "Processor 5", "RAM 8", 8);
        computersArr[8] = new Computer("Model 2", "Processor 9", "RAM 9", 9);
        computersArr[9] = new Computer("Model 1", "Processor 1", "RAM 5", 10);


        for (int i = 0; i < computersArr.length; i++) {
            computerStock.addComputer(computersArr[i]);
        }
        System.out.println(computerStock.size());
        System.out.println("======================");
        Computer[] res = computerStock.findComputerByProcessor("Processor 2");
        printArrComputer(res);
        System.out.println("=========sort=============");

        Arrays.sort(computersArr,Computer.idComparator);

        printArrComputer(computersArr);

    }

    public static void printArrComputer(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
