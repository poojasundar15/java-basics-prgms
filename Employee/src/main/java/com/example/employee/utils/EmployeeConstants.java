package com.example.employee.utils;

public class EmployeeConstants {
    public static final String NAME_REGEX = "^[a-zA-Z\\\\s]*$";
    public static final String Number_Regex ="^[0-9]";
    public static final String Date_Regex= "^\\d{4}-\\d{2}-\\d{2}$";
    public static final String NO_FIRST_NAME = "First name not provided";
    public static final String INVALID_FIRST_NAME = "Invalid First Name";
    public static final String INVALID_LAST_NAME = "Invalid Last Name";
    public static final String INVALID_GENDER_NAME = "Invalid Gender Name";
    public static final String NO_GENDER = "Gender Name  is not provided";
    public static final String NO_AGE = " Age is not provided";
    public static final String INVALID_AGE = "Invalid Age";
    public static final String INVALID_POSITION = "Invalid POSITION";
    public static final String NO_POSITION = "Position is not provided";
    public static final String NO_NUMBER= "Phone number not provided";
    public static final String NO_DATEOFJOINING= "Date of joining is not provided";
    public static final String GET_EMPLOYEE = "/employeeInfo";
    public static final String POST_EMPLOYEE="/insertData";
    public static final String PUT_EMPLOYEE = "/putData";
    public static final String DELETE_EMPLOYEE="/deleteData";
    public static final String EMPLOYEE_SAVED="employee saved successfully";
    public static final String API = "api/v1" ;
}
