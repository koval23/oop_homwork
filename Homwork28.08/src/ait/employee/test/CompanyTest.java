package ait.employee.test;

import ait.employee.dao.Company;
import ait.employee.dao.CompanyImpl;
import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company company;
    Employee[] employees;


//    *************************************

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jacson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindronae", "Anand", 80, 30000, 0.1);
        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }

    }

    @org.junit.jupiter.api.Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employees[1]));
        Employee employee = new SalesManager(5000, "Rabindronae", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5,company.quantity());
        employee = new SalesManager(6000, "Rabindronae", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));

    }

    @org.junit.jupiter.api.Test
//    удалить сотрудника
//    - проверить есть ли работник
//    -
    void removeEmployee() {

    }

    @org.junit.jupiter.api.Test
//    найти сотрудника
    void findEmployee() {
    }

    @org.junit.jupiter.api.Test
//    количество сотрудников
    void quantity() {
    }

    @org.junit.jupiter.api.Test
//    зарплата всех сотрудников
    void totalSalary() {
    }

    @org.junit.jupiter.api.Test
//    средняя зарплата всех сотрудников
    void avgSalary() {
    }

    @org.junit.jupiter.api.Test
//    количество продаж компании
    void totalSales() {
    }

    @org.junit.jupiter.api.Test
    void printEmployees() {
        company.printEmployees();
    }
}