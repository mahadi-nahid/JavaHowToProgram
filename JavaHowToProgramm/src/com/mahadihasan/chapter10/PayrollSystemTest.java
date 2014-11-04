package com.mahadihasan.chapter10;

/**
 *
 * @author MdMahadiHasan
 */
public class PayrollSystemTest {

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = 
                new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
        
        
        System.out.println("Employees processes individually: \n");
        
        System.out.println(""+salariedEmployee+" \nearned "+salariedEmployee.earnings());
        System.out.println(""+hourlyEmployee+" \nearned "+hourlyEmployee.earnings());
        System.out.println(""+commissionEmployee+" \nearned "+commissionEmployee.earnings());
        System.out.println(""+basePlusCommissionEmployee+" \nearned "+basePlusCommissionEmployee.earnings());
        
        
        
        Employee[] employees = new Employee[4];
        
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.println("Employee processed polymorphically: \n");
        
        
        for(Employee currentEmployee : employees) {
            System.out.println(""+currentEmployee);
            
            if(currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = 
                        (BasePlusCommissionEmployee) currentEmployee;
                
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                
                System.out.println("new base salary with 10%% increase is: $"+employee.getBaseSalary());
                
            }
            
            System.out.println("earing $"+currentEmployee.earnings()+"\n\n");
        }
        
        for (int j = 0; j < employees.length; j++ ){
            System.out.println("Employee "+j+ " is a "+employees[j].getClass().getName());
        }
        
    }
}
