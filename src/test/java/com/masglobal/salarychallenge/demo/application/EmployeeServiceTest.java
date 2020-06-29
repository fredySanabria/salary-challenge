package com.masglobal.salarychallenge.demo.application;

import com.masglobal.salarychallenge.demo.DTO.EmployeeDTO;
import com.masglobal.salarychallenge.demo.domain.EmployeeEntity;
import com.masglobal.salarychallenge.demo.repositories.IEmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @InjectMocks
    EmployeeService testTarget;

    @Mock
    IEmployeeRepository repository;

    private List<EmployeeEntity> employeeList;

    @BeforeEach
    void setUp() {
        EmployeeEntity employeeTest = EmployeeEntity
                .builder()
                .id("Test")
                .contractTypeName("HourlySalaryEmployee")
                .hourlySalary("30000")
                .build();
        EmployeeEntity employeeOtherTest = EmployeeEntity
                .builder()
                .id("Test1")
                .contractTypeName("MonthlySalaryEmployee")
                .monthlySalary("60000")
                .build();
        employeeList = new ArrayList<>();
        employeeList.add(employeeTest);
        employeeList.add(employeeOtherTest);
    }

    @Test
    public void wouldReturnValidListOfEmployeesWhenServiceIsCalled(){
        when(repository.getEmployees()).thenReturn(employeeList);
        List<EmployeeDTO> result = testTarget.getEmployees();
        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
    }
}