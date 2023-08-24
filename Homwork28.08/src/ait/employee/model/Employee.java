package ait.employee.model;

public abstract class Employee {
//    TODO abstract?
    protected final int id;
    protected String firstNName;
    protected String lastName;
    protected double hours;

    public Employee(int id, String firstNName, String lastName, double hours) {
        this.id = id;
        this.firstNName = firstNName;
        this.lastName = lastName;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }


    public String getFirstNName() {
        return firstNName;
    }

    public void setFirstNName(String firstNName) {
        this.firstNName = firstNName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public abstract double calcSalary();


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("id=").append(id);
        sb.append(", firstNName='").append(firstNName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

}
