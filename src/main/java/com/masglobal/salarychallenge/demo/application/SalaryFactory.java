package com.masglobal.salarychallenge.demo.application;

import com.masglobal.salarychallenge.demo.domain.EmployeeEntity;

public class SalaryFactory {
    /**
     * Get Salary method creates a different salary type
     * depending the salary Contract type
     * @param employee
     * @return
     */
    public double getSalary(EmployeeEntity employee) {
        switch (employee.getContractTypeName()) {
            case "HourlySalaryEmployee":
                Salary hourlySalary = new HourlySalary();
                hourlySalary.getRate();
                return hourlySalary.calculateSalary(Double.parseDouble(employee.getHourlySalary()));
            case "MonthlySalaryEmployee":
                Salary monthlySalary = new MonthlySalary();
                monthlySalary.getRate();
                return monthlySalary.calculateSalary(Double.parseDouble(employee.getMonthlySalary()));
            default:
                return 0;
        }
    }
}
