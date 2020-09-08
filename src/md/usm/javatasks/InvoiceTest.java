package md.usm.javatasks;

import md.usm.javatasks.beans.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice invoice1 = new Invoice("Test 1", "Description 1", 4, 1.5);
        Invoice invoice2 = new Invoice("Test 2", "Description 2", 0, 1.5);
        Invoice invoice3 = new Invoice("Test 3", "Description 3", 4, 0.0);
        Invoice invoice4 = new Invoice("Test 4", "Description 4", 0, 0.0);
        Invoice invoice5 = new Invoice("Test 4", "Description 4", -5, 4.0);

        System.out.println("Invoice with number: " + invoice1.getNumber() + " and description: " + invoice1.getDescription() +
                " has invoice amount: " + invoice1.getInvoiceAmount());
        System.out.println("Invoice with number: " + invoice2.getNumber() + " and description: " + invoice2.getDescription() +
                " has invoice amount: " + invoice2.getInvoiceAmount());
        System.out.println("Invoice with number: " + invoice3.getNumber() + " and description: " + invoice3.getDescription() +
                " has invoice amount: " + invoice3.getInvoiceAmount());
        System.out.println("Invoice with number: " + invoice4.getNumber() + " and description: " + invoice4.getDescription() +
                " has invoice amount: " + invoice4.getInvoiceAmount());
        System.out.println("Invoice with number: " + invoice5.getNumber() + " and description: " + invoice5.getDescription() +
                " has invoice amount: " + invoice5.getInvoiceAmount());
    }
}