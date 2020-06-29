package com.masglobal.salarychallenge.demo.DTO;

import com.masglobal.salarychallenge.demo.domain.Rol;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EmployeeDTO {
    String id;
    String name;
    String contract;
    double netSalary;
    Rol employeeRol;

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contract=" + contract +
                ", netSalary=" + netSalary +
                ", employeeRol=" + employeeRol +
                '}';
    }
}
