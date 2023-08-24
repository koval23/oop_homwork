package ait.employee;

import ait.employee.model.Employee;
import ait.employee.model.Manager;

public class EmployeeAppl {
    public static void main(String[] args) {


       Employee empl1 = new Manager(1000, "John", "Smith", 160, 3000, 5);
       Employee empl2 = new Manager(1000, "John", "Smith", 160, 3000, 5);
       boolean check = empl1 == empl2;
        System.out.println(check);


    }

    //    ********* Method ************



}
