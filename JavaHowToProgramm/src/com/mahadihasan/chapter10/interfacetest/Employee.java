package com.mahadihasan.chapter10.interfacetest;

/**
 *
 * @author MdMahadiHasan
 */
public abstract class Employee implements Payable{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    public void setFirstName(String first) {
        firstName = first;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String last) {
        lastName = last;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }
    
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    

    @Override
    public String toString() {
       return String.format("%s %s \nSocial Security Number: %s", 
               getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    
    
}
