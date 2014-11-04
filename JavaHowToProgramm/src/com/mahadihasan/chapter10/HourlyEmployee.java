package com.mahadihasan.chapter10;

/**
 *
 * @author MdMahadiHasan
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String first, String last, String ssn) {
        super(first, last, ssn);
        
    }
    
    public void setWage(double hourlywage ) {
        if(hourlywage >= 0) {
            wage = hourlywage;
        }
        else
            throw new IllegalArgumentException(
                    "hourly wage must be >= 0.0");
    }
    
    public double getWage() {
        return wage;
    }
    
    public void setHours(Double hoursWorked) {
        if((hoursWorked >= 0 ) && (hoursWorked <= 168.0)){
            hours = hoursWorked;
        }
        else 
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");
    }
    
    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 40 ) {
            return getWage() * getHours();
        }
        else
            return 40 * getWage() + (getHours() - 40) *getWage()*1.5;
    }

    @Override
    public String toString() {
    
        return String.format("Hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(), "hourly worked", getHours());
    
    }
    
    
}
