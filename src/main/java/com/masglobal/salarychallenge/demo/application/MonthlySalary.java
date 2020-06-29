package com.masglobal.salarychallenge.demo.application;

public class MonthlySalary extends Salary {
    @Override
    void getRate() {
        rate = 12;
    }
}
