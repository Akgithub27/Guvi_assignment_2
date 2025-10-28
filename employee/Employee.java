package employee;

import person.Person;

public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee emp = new Employee("aakash",25,101,80000);
        System.out.println("your details: ");
        System.out.println("Name : "+emp.getName());
        System.out.println("Age : "+emp.getAge());
        System.out.println("Emp Id : "+emp.getEmpId());
        System.out.println("Salary : "+emp.getSalary());
    }
}
