package com.masglobal.salarychallenge.demo.rest_interface;

import com.masglobal.salarychallenge.demo.DTO.EmployeeDTO;
import com.masglobal.salarychallenge.demo.application.EmployeeService;
import com.masglobal.salarychallenge.demo.exception.EmployeeNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class ApplicationController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public List<EmployeeDTO> getEmployeeList() {
        return employeeService.getEmployees();
    }

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployee(@PathVariable Integer id) {
        EmployeeDTO result = employeeService.findEmployee(id);
        if (result == null) {
            throw new EmployeeNotFoundException("id-" + id);
        }
        return result;
    }
}
