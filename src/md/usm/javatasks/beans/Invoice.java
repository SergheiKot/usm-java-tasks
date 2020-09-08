package md.usm.javatasks.beans;

public class Invoice {

    private String number;

    private String description;

    private int quantity;

    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount() {
        int quantityValue = this.quantity > 0 ? this.quantity : 0;
        double priceValue = this.price > 0.0 ? this.price : 0.0;

        return quantityValue * priceValue;
    }
}
