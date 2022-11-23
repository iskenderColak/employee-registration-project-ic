package com.icolak.service;

import com.icolak.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {

    public static List<Employee> employeeList = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> readAllEmployees() {
        return employeeList;
    }
}
