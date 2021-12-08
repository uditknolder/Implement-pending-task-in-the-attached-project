package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.util.HashMap;
import java.util.Map;

public class SaveEmployeeServiceImpl implements SaveEmployeeService{

    Map<Integer,Employee> employeeMap = new HashMap<>();
    @Override
    public void saveEmployee(Employee employee) {
        employeeMap.put(employee.getId(),employee);
    }

    @Override
    public int getEmployeeCount() {
            return Employee.count;
    }
}
