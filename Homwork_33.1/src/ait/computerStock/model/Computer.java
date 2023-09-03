package ait.computerStock.model;

import java.util.Comparator;
import java.util.Objects;

public class Computer implements Comparable<Computer>{
    private String model;
    private String processor;
    private String ram;
    private int id;

    public Computer(String model, String processor, String ram, int id) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.id = id;
    }


    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("model='").append(model).append('\'');
        sb.append(", processor='").append(processor).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append(", id=").append(id).append(('\''));
        sb.append('}');
        return sb.toString();
    }

    //=========================comparator============================
//    public static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);

//    public static Comparator<Employee> nameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

//=================================================


    public static Comparator<Computer> nameComparator = (e1, e2) -> {
     int resModel = e1.getModel().compareTo(e2.getModel());
        if (resModel != 0) {
            return resModel;
        }
//        int resRam = e1.getRam().compareTo(e2.getRam());
//        if (resRam != 0) {
//            return resRam;
//        }
//
        return e1.getProcessor().compareTo(e2.getProcessor());
    };
    public static Comparator<Computer> processorComparator = (e1, e2) -> {

        return e1.getProcessor().compareTo(e2.getProcessor());
    };
    public static Comparator<Computer> idComparator = (e1, e2) -> {

        return e1.getId() - (e2.getId());
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return id == computer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Computer computer) {

//        return processor.compareTo(computer.getProcessor());

        return computer.getProcessor().compareTo(processor);
    }

}
