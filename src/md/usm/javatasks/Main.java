package md.usm.javatasks;

import java.util.Scanner;

public class Main {

    private static final double BASE_FEE = 2.00;
    private static final double HOURLY_FEE = 0.50;
    private static final double MAX_FEE = 10.00;

    private static double total = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time;

        do {
            System.out.print("Enter hours parked (-1 to exit): ");
            time = scanner.nextDouble();

            if (time > 0) {
                System.out.println("Charges: " + calculateCharges(time));
            }
        } while (time != -1);

        System.out.println("Total charges for the day: " + total);
    }

    public static double calculateCharges(double time) {
        if (time > 3.0) {
            double fee = BASE_FEE + (HOURLY_FEE * Math.ceil(time - 3.0));

            total += Math.min(fee, MAX_FEE);
            return Math.min(fee, MAX_FEE);
        }
        total += BASE_FEE;
        return BASE_FEE;
    }
}