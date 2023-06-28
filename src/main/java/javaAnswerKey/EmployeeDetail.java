package javaAnswerKey;

import java.util.Scanner;

abstract class Employee
{
    public int emp_id;
    public String emp_name;
    public abstract void employeeDetails();
}
class Employees extends Employee
{
    @Override
    public void employeeDetails() {
        System.out.println("Enter the Employee ID = ");
        Scanner scanner = new Scanner(System.in);
        emp_id=scanner.nextInt();
        System.out.println("Enter the Employee Name = ");
        Scanner scanner1 = new Scanner(System.in);
        emp_name=scanner1.nextLine();
        System.out.println("Employee ID = "+emp_id);
        System.out.println("Employee Name = "+emp_name);
    }
    public void empSalaryDetails()
    {
        int empSalary;
        String empDesignation;
        System.out.println("Enter the Employee Designation = ");
        Scanner sc = new Scanner(System.in);
        empDesignation = sc.nextLine();
        System.out.println("Enter the Employee Salary (in Numbers) = ");
        Scanner sc1 = new Scanner(System.in);
        empSalary = sc1.nextInt();
        System.out.println("Employee Designation = "+empDesignation);
        System.out.println("Employee Salary Details  = "+empSalary);
    }
}
public class EmployeeDetail {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.employeeDetails();
        employees.empSalaryDetails();
    }
}
