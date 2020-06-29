package com.masglobal.salarychallenge.demo.application;

public class HourlySalary extends Salary{

    @Override
    void getRate() {
        rate = 120 * 12;
    }
}
