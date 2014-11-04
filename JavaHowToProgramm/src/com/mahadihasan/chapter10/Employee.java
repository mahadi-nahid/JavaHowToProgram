package com.mahadihasan.chapter10;

/**
 *
 * @author MdMahadiHasan
 */
public abstract class Employee {
    
    private String firstNeme;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String first, String last, String ssn) {
        firstNeme = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }
    
    public void setFirstName (String first) {
        firstNeme = first;
    }
    
    public String getFirstName(){
        return firstNeme;
    }
    public void setlastName(String last) {
        lastName = last;
    }
    
    public String getLastname() {
        return lastName;
    }
    
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public abstract double earnings();
    
    @Override
    public String toString() {
        return String.format("%s %s \nsocialSecurity Number : %s", getFirstName(), 
                getLastname(), getSocialSecurityNumber());
    }
    
    
    
}
