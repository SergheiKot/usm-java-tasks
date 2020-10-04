package md.usm.javatasks.beans;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName,
                                      String lastName,
                                      String socialSecurityNumber,
                                      double grossSales,
                                      double commissionRate,
                                      double baseSalary) {

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0.0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase salary: " + getBaseSalary();
    }
}
