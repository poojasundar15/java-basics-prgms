package com.example.employee.service;

import com.example.employee.entity.Employee;


public interface EmployeeService {

    String addEmployee(Employee employee);

    Employee getEmployee(Long employeeId);

    String updateData(Employee employeeInfo);

    void deleteData(int id);
}
