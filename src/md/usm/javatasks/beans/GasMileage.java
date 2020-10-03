package md.usm.javatasks.beans;

public class GasMileage {

    private double miles, gallons;

    public double getTripMPG(int miles, int gallons) {
        this.miles += miles;
        this.gallons += gallons;

        return (double) miles / gallons;
    }

    public double getMiles() {
        return miles;
    }

    public double getGallons() {
        return gallons;
    }

    public double getMPG() {
        return miles / gallons;
    }
}
