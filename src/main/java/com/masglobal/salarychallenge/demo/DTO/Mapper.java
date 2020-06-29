package com.masglobal.salarychallenge.demo.DTO;

import com.masglobal.salarychallenge.demo.application.SalaryFactory;
import com.masglobal.salarychallenge.demo.domain.EmployeeEntity;
import com.masglobal.salarychallenge.demo.domain.Rol;

public final class Mapper {

    public static EmployeeDTO mapToDto(EmployeeEntity entity) {
        SalaryFactory salaryFactory = new SalaryFactory();
        return EmployeeDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .contract(entity.getContractTypeName())
                .employeeRol(
                        Rol.builder()
                                .rolId(entity.getRoleId())
                                .roleDescription(entity.getRoleDescription())
                                .roleName(entity.getRoleName())
                                .build())
                .netSalary(salaryFactory.getSalary(entity))
                .build();
    }
}
