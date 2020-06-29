package com.masglobal.salarychallenge.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeEntity {
    private String id;
    private String name;
    private String contractTypeName;
    private String roleId;
    private String roleName;
    private String roleDescription;
    private String hourlySalary;
    private String monthlySalary;

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contract='" + contractTypeName + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", hourlySalary='" + hourlySalary + '\'' +
                ", monthlySalary='" + monthlySalary + '\'' +
                '}';
    }
}
