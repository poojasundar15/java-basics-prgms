package com.example.employee.controller;


import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import com.example.employee.utils.EmployeeConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = EmployeeConstants.API)
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = EmployeeConstants.GET_EMPLOYEE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getUser(@RequestParam("id") Optional<Long> employeeId) {
        if (employeeId.isPresent()) {
            Employee employeeDetails = employeeService.getEmployee(employeeId.get());
            if (employeeDetails!= null) {
                return new ResponseEntity<Employee>(employeeDetails, HttpStatus.OK);
            }
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value = EmployeeConstants.POST_EMPLOYEE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {

        String serviceResponse = employeeService.addEmployee(employee);
        if (serviceResponse != null) {
            return ResponseEntity.ok(serviceResponse);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping(value = EmployeeConstants.PUT_EMPLOYEE)
        public ResponseEntity<String>updateData(@RequestBody Employee employee) {

            java.lang.String serviceResponse = employeeService.addEmployee(employee);
            if (serviceResponse != null) {
                return ResponseEntity.ok(serviceResponse);
            } else {
                return new ResponseEntity(HttpStatus.BAD_REQUEST);
            }
    }
    @DeleteMapping(value = EmployeeConstants.DELETE_EMPLOYEE)
    public void deleteEmployeeDetails(@RequestParam int id){
        employeeService.deleteData(id);
    }
}