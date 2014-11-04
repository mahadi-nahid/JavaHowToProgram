
package com.mahadihasan.chapter09;

/**
 *
 * @author nahid44
 */
public class BasePlusCommissionEmployeeTest {
    
     public static void main(String[] args) {
         
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Mahadi Hasan", "Nahid", "2010-331-004", 1000, 0.06, 2500);
        
        System.out.println(
                "Employee Information Obtained By get Method: \n");
        System.out.printf("Fist Name is: %s\n",
                employee.getFirstName());
        System.out.printf("Last Name is: %s\n",
                employee.getLastName());
        System.out.printf("%s  %s\n", 
                "Social Security Number is: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross Sales is: ",
                employee.getGrossSales());
        
        System.out.printf("%s %.2f\n", "Commission Rate: ",
                employee.getCommissionRate());
        
        employee.setGrossSales(500);
        employee.setCommissionRate(0.1);
        
        
        System.out.printf("\n%s:\n\n%s\n",
                "Update employee information obtained by toString ", employee);
    }
}
