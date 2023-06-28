package com.example.employee.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class EmployeeModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long employee_Id;

    @NotNull
    @NotBlank(message="Please enter your first name")
    private String first_Name;

    @NotNull
    @NotBlank(message="Please enter your last name")
    private String last_Name;

    @NotNull
    @NotBlank(message="Please enter your age")
    private int age;

    @NotNull
    @NotBlank(message="Please enter your gender")
    private String gender;

    @NotNull
    @NotBlank(message="Please enter your position")
    private String position;

    @NotNull
    @NotBlank(message="Please enter your date of joining")
    private Date date_of_Joining;
}
