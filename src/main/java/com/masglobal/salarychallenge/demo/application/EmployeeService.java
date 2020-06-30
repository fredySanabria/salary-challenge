package com.masglobal.salarychallenge.demo.application;

import com.masglobal.salarychallenge.demo.DTO.EmployeeDTO;
import com.masglobal.salarychallenge.demo.DTO.Mapper;
import com.masglobal.salarychallenge.demo.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    /**
     * Get Employees method get entity list from repository and
     * map each one to EmployeeDTO
     * @return
     */
    public List<EmployeeDTO> getEmployees(){
        return employeeRepository.getEmployees()
                .stream()
                .map(Mapper::mapToDto)
                .collect(Collectors.toList());
    }

    /**
     * Find Employee method get entity list from
     * repository and filter by id, after that Map to DTO object
     * @param id
     * @return
     */
    public EmployeeDTO findEmployee(Integer id) {
        return employeeRepository.getEmployees()
                .stream()
                .filter(employee -> Integer.parseInt(employee.getId()) == id)
                .map(Mapper::mapToDto)
                .findFirst()
                .orElse(null);
    }
}
