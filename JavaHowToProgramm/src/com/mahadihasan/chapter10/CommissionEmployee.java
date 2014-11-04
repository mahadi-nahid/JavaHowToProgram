
package com.mahadihasan.chapter10;

/**
 *
 * @author MdMahadiHasan
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, 
            double sales, double rate) {
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    
    public void setCommissionRate(double rate) {
        if(rate > 0.0 && rate < 1.0) {
            commissionRate = rate;
        }
        else 
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    
    public void setGrossSales(double sales) {
        if(sales >= 0.0) {
            grossSales = sales;
        }
        else 
            throw new IllegalArgumentException(
                    "Gross Sales must be >= 0.0");
    }
    
    
    public double getGrossSales() {
        return grossSales;
    }
    
    
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return  String.format("%s: %s\n%s: $%,.02f: %s : %.2f", 
                "Commission Employee", super.toString(), 
                "gross sales", getGrossSales(), 
                "commission rate", getCommissionRate());
    }
    
}
