package com.mahadihasan.chapter10.interfacetest;

/**
 *
 * @author MdMahadiHasan
 */
public class PayableInterfacetest {

    public static void main(String[] args) {
        Payable[] payableObjects  = new Payable[4];
        
        payableObjects[0] = new Invoice("01234", "Seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "Tire", 4, 79.95);
        payableObjects[2] = 
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = 
                new SalariedEmployee("Lisa", "Barners", "888-88-8888", 1200.00);
        
        
        System.out.println("Invoices and Employees processed polymorphically:\n");
        
        for(Payable currentPayable : payableObjects) {
            System.out.println(""+currentPayable.toString()+"\npayment due: $"+
                    currentPayable.getPaymentAmount());
            
        }
    }
}
