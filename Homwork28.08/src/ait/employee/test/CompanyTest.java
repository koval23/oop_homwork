import ait.employee.dao.Company;
import ait.employee.dao.CompanyImpl;
import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompanyTest {
    Company company;
    Employee[] employees;

    // Настройка тестовой среды перед каждым тестом
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employees = new Employee[4];
        // Создание разных типов сотрудников и добавление их в компанию
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jacson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindronae", "Anand", 80, 30000, 0.1);
        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }
    }

    // Тест для метода addEmployee()
    @org.junit.jupiter.api.Test
    void addEmployee() {
        // Проверка добавления сотрудника с null значением (не должен добавиться)
        assertFalse(company.addEmployee(null));
        // Проверка добавления уже существующего сотрудника (не должен добавиться)
        assertFalse(company.addEmployee(employees[1]));
        // Проверка добавления нового сотрудника (должен добавиться успешно)
        Employee employee = new SalesManager(5000, "Rabindronae", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        // Проверка общего количества сотрудников после добавления
        assertEquals(5, company.quantity());
        // Проверка попытки добавления сотрудника с уже существующим id (не должен добавиться)
        employee = new SalesManager(6000, "Rabindronae", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));
    }

    // Тест для метода removeEmployee()
    @org.junit.jupiter.api.Test
    void removeEmployee() {
        // Проверка удаления сотрудника (должен успешно удалиться)
        assertEquals(employees[1], company.removeEmployee(2000));
        // Проверка изменения общего количества сотрудников после удаления
        assertEquals(3, employees.length);
        // Проверка попытки удаления несуществующего сотрудника (должен вернуть null)
        assertNull(company.removeEmployee(5000));
    }

    // Тест для метода findEmployee()
    @org.junit.jupiter.api.Test
    void findEmployee() {
        // Проверка поиска существующего сотрудника (должен успешно найти)
        assertEquals(employees[0], company.findEmployee(1000));
        // Проверка поиска несуществующего сотрудника (должен вернуть null)
        assertNull(company.removeEmployee(5000));
    }

    // Тест для метода quantity()
    @org.junit.jupiter.api.Test
    void quantity() {
        // Проверка подсчета общего количества сотрудников
        assertEquals(4, company.quantity());
    }

    // Тест для метода totalSalary()
    @org.junit.jupiter.api.Test
    void totalSalary() {
        // Проверка подсчета общей зарплаты всех сотрудников
        assertEquals(8200, company.totalSalary());
    }

    // Тест для метода avgSalary()
    @org.junit.jupiter.api.Test
    void avgSalary() {
        // Проверка вычисления средней зарплаты всех сотрудников
        assertEquals(2050, company.avgSalary());
    }

    // Тест для метода totalSales()
    @org.junit.jupiter.api.Test
    void totalSales() {
        // Проверка подсчета общей суммы продаж компании
        assertEquals(50000, company.totalSales());
    }

    // Тест для метода printEmployees()
    @org.junit.jupiter.api.Test
    void printEmployees() {
        // Проверка вывода информации о сотрудниках (просто запускает метод без проверок)
        company.printEmployees();
    }
}
