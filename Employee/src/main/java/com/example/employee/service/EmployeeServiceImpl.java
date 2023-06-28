package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import static com.example.employee.utils.EmployeeConstants.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    private EmployeeRepo employeeUserRepository;

    @Override
    public String addEmployee(Employee employee) {
        if (ObjectUtils.isEmpty(employee.getFirst_Name())) {
            logger.error(NO_FIRST_NAME);
            return NO_FIRST_NAME;
        } else {
            Pattern namePattern = Pattern.compile(NAME_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher firstNameMatcher = namePattern.matcher(employee.getFirst_Name());
            boolean validFirstName = firstNameMatcher.find();
            if (!validFirstName) {
                logger.error(INVALID_FIRST_NAME, employee.getFirst_Name());
                return INVALID_FIRST_NAME;
            }
            if (!ObjectUtils.isEmpty(employee.getLast_Name())) {
                Matcher lastNameMatcher = namePattern.matcher(employee.getLast_Name());
                boolean validLastName = lastNameMatcher.find();
                if (!validLastName) {
                    logger.error(INVALID_LAST_NAME, employee.getLast_Name());
                    return INVALID_LAST_NAME;
                }
            }
        }
        if (ObjectUtils.isEmpty(employee.getGender())) {
            logger.error(NO_GENDER);
            return NO_GENDER;
        } else {
            Pattern namePattern = Pattern.compile(NAME_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher firstNameMatcher = namePattern.matcher(employee.getFirst_Name());
            boolean validFirstName = firstNameMatcher.find();
            if (!validFirstName) {
                logger.error(INVALID_GENDER_NAME, employee.getFirst_Name());
                return INVALID_GENDER_NAME;
            }
        }
        if (ObjectUtils.isEmpty(employee.getPosition())) {
            logger.error(NO_POSITION);
            return NO_POSITION;
        } else {
            Pattern namePattern = Pattern.compile(NAME_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher firstNameMatcher = namePattern.matcher(employee.getPosition());
            boolean validFirstName = firstNameMatcher.find();
            if (!validFirstName) {
                logger.error(INVALID_POSITION, employee.getPosition());
                return INVALID_POSITION;
            }
        if (ObjectUtils.isEmpty(employee.getDate_of_Joining())) {
            logger.error(NO_DATEOFJOINING);
            return NO_DATEOFJOINING;
        } else {
            try {
                Date dateOfBirth = new SimpleDateFormat("yyyy-dd-mm").parse(employee.getDate_of_Joining());
            } catch (Exception e) {
                logger.error("Invalid Date/ Invalid Date Format");
                return "Invalid Date/ Invalid Date Format";
            }
        }
        if (ObjectUtils.isEmpty(employee.getAge())) {
            logger.error(NO_AGE);
            return NO_AGE;
        } else {
            Pattern numberPattern = Pattern.compile(Number_Regex);
            Matcher ageMatcher = numberPattern.matcher(employee.getAge());
            boolean validAge= ageMatcher.find();
            if (!validFirstName) {
                logger.error(INVALID_AGE, employee.getAge());
                return INVALID_AGE;
            }
        }
        employeeUserRepository.save(employee);
        return EMPLOYEE_SAVED;
    }}


    @Override
    public Employee getEmployee(Long employeeId) {
        Employee employeeInfo = employeeUserRepository.findByEmployeeId(employeeId);
        if (employeeInfo != null) {
            logger.info("Returning employee Info");
            return employeeInfo;
        }
        logger.error("Employee not registered",employeeId);
        return null;
    }

    @Override
    public String updateData(Employee employee) {
        if (ObjectUtils.isEmpty(employee.getFirst_Name())) {
            logger.error(NO_FIRST_NAME);
            return NO_FIRST_NAME;
        } else {
            Pattern namePattern = Pattern.compile(NAME_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher firstNameMatcher = namePattern.matcher(employee.getFirst_Name());
            boolean validFirstName = firstNameMatcher.find();
            if (!validFirstName) {
                logger.error(INVALID_FIRST_NAME, employee.getFirst_Name());
                return INVALID_FIRST_NAME;
            }
            if (!ObjectUtils.isEmpty(employee.getLast_Name())) {
                Matcher lastNameMatcher = namePattern.matcher(employee.getLast_Name());
                boolean validLastName = lastNameMatcher.find();
                if (!validLastName) {
                    logger.error(INVALID_LAST_NAME, employee.getLast_Name());
                    return INVALID_LAST_NAME;
                }
            }
        }
        if (ObjectUtils.isEmpty(employee.getGender())) {
            logger.error(NO_GENDER);
            return NO_GENDER;
        } else {
            Pattern namePattern = Pattern.compile(NAME_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher firstNameMatcher = namePattern.matcher(employee.getFirst_Name());
            boolean validFirstName = firstNameMatcher.find();
            if (!validFirstName) {
                logger.error(INVALID_GENDER_NAME, employee.getFirst_Name());
                return INVALID_GENDER_NAME;
            }
        }
        if (ObjectUtils.isEmpty(employee.getPosition())) {
            logger.error(NO_POSITION);
            return NO_POSITION;
        } else {
            Pattern namePattern = Pattern.compile(NAME_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher firstNameMatcher = namePattern.matcher(employee.getPosition());
            boolean validFirstName = firstNameMatcher.find();
            if (!validFirstName) {
                logger.error(INVALID_POSITION, employee.getPosition());
                return INVALID_POSITION;
            }
            if (ObjectUtils.isEmpty(employee.getDate_of_Joining())) {
                logger.error(NO_DATEOFJOINING);
                return NO_DATEOFJOINING;
            } else {
                try {
                    Date dateOfBirth = new SimpleDateFormat("yyyy-dd-mm").parse(employee.getDate_of_Joining());
                } catch (Exception e) {
                    logger.error("Invalid Date/ Invalid Date Format");
                    return "Invalid Date/ Invalid Date Format";
                }
            }
            if (ObjectUtils.isEmpty(employee.getAge())) {
                logger.error(NO_AGE);
                return NO_AGE;
            } else {
                Pattern numberPattern = Pattern.compile(Number_Regex);
                Matcher ageMatcher = numberPattern.matcher(employee.getAge());
                boolean validAge= ageMatcher.find();
                if (!validFirstName) {
                    logger.error(INVALID_AGE, employee.getAge());
                    return INVALID_AGE;
                }
            }

            return EMPLOYEE_SAVED;
        }}

    @Override
    public void deleteData(int id) {

    }
}