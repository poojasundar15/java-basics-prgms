package com.example.employee.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @Column(name = "firstName")
    private String first_Name;

    @Column(name = "lastName")
    private String last_Name;

    @Column(name = "age")
    private String age;

    @Column(name="gender")
    private String gender;

    @Column(name = "position")
    private String position;

    @Column(name="dateofjoining")
   private  String date_of_Joining;

}
