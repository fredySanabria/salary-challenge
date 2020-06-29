package com.masglobal.salarychallenge.demo.repositories;

import com.masglobal.salarychallenge.demo.domain.EmployeeEntity;

import java.util.List;

public interface IEmployeeRepository {
    List<EmployeeEntity> getEmployees();
}
