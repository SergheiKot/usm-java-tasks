package md.usm.javatasks;

import md.usm.javatasks.beans.*;

import java.util.Calendar;

public class PayrollSystemTest {
    public static void main(String[] args) {

        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Tom", "True", "11-11-11",
                650.0f, 9, 4, 2000);
        employees[1] = new HourlyEmployee("Tom", "False", "22-22-22",
                20.5f, 25.0f, 10, 25, 2010);
        employees[2] = new CommissionEmployee("Bu", "Mer", "33-33-33",
                9000.0f, .05f, 11, 20, 2005);
        employees[3] = new BasePlusCommissionEmployee("Buba", "Duba", "44-44-44",
                7500.0f, .06f, 250.0f, 12, 9, 2003);

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f\n\n",
                    (currentEmployee.getBirthDate().getMonth() == currentMonth) ?
                            currentEmployee.earnings() + 100.0f : currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getName());
        }
    }
}