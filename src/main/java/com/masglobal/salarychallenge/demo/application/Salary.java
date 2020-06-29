package com.masglobal.salarychallenge.demo.application;

public abstract class Salary {

    protected double rate;
    abstract void getRate();

    /**
     * Calculate Salary depending the rate and the workUnits (hours, months, etc)
     *
     * @param workUnits
     * @return Net salary
     */
    public double calculateSalary(double workUnits) {
        return rate * workUnits;
    }
}
