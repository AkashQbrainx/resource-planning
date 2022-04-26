package com.flexcub.resource.planning.controller;

import com.flexcub.resource.planning.entity.Employee;
import com.flexcub.resource.planning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/req")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/get")
    public List<Employee> getEMployeeDetails() {
        return employeeService.getData();
    }

    @GetMapping(value = "/getById")
    public Optional<Employee> getEMployeeById(@RequestParam int id) {
        return employeeService.getDataById(id);
    }

    @PostMapping(value = "/insertData")
    public Employee insertEmployeeDetails(@RequestBody Employee employee) {
        return employeeService.insertData1(employee);
    }

    @DeleteMapping(value = "/deleteData")
    public void deleteEmployeeDetails(@RequestParam int id) {
        employeeService.deleteData(id);
    }

    @PostMapping(value = "/updateData")
    public Employee updateEmployeeDetails(@RequestBody Employee employee) {
        return employeeService.updateDetails(employee);
    }

}
