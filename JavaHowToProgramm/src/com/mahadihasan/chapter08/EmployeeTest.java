
package com.mahadihasan.chapter08;

/**
 *
 * @author nahid44
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        
        Employee employee = new Employee("Nahid", "Mahadi Hasan", birth, hire);
        System.out.println(employee);
    }
}
