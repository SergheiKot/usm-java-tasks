package md.usm.javatasks;

import md.usm.javatasks.beans.GasMileage;

import java.util.Scanner;

public class GasMileageTest {
    public static void main(String[] args) {
        int miles, gallons;
        char cont = 'y';

        Scanner scanner = new Scanner(System.in);
        GasMileage gasMileage = new GasMileage();

        while (cont != 'n') {

            System.out.print("Enter Gas Mileage for this trip: ");
            miles = scanner.nextInt();
            System.out.print("Enter Gallons used for this trip: ");
            gallons = scanner.nextInt();

            System.out.printf("Your MPG for this trip is: %.2f\n",
                    gasMileage.getTripMPG(miles, gallons));

            System.out.print("Add another trip? (y/n): ");
            cont = scanner.next().charAt(0);
        }

        System.out.printf("Combined mileage: %.2f\nCombined gallon usage: %.2f\n",
                gasMileage.getMiles(), gasMileage.getGallons());
        System.out.printf("Your combined MPG for all trips is: %.2f\n",
                gasMileage.getMPG());
    }
}