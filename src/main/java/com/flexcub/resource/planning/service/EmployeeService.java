package com.flexcub.resource.planning.service;

import com.flexcub.resource.planning.repository.EmployeeRepository;
import com.flexcub.resource.planning.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getData() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getDataById(int id) {
        return employeeRepository.findById(id);
    }

    public Employee insertData1(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    public void deleteData(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateDetails(Employee employee){
        return employeeRepository.saveAndFlush(employee);
    }
}
