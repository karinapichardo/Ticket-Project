package com.company;

public class Concert {

    public static void main(String[] args) {

        //creating objects of class ticket
        Ticket generalAdmission = new Ticket(200.50, 8, 16.04);
        Ticket vip = new Ticket(400.50, 8, 32.04);
        Ticket reservedSeating = new Ticket(600.50, 8, 48.04);

        System.out.println("Listing of All Packages (packages include 8 tickets)");

// calling method
        System.out.println("\nGeneral Admission Package - Total Charges: $" + generalAdmission.calculateTotal());

        System.out.println("VIP Package - Total Charges: $" + vip.calculateTotal());

        System.out.println("Reserved Seating Package - Total Charges: $" + reservedSeating.calculateTotal());
    }
}

class Ticket {
    double price;                //price of each ticket
    int quantity;               //number of tickets
    double taxAmount;          //tax imposed

    //constructor
    Ticket(double price, int quantity, double taxAmount) {
        this.price = price;
        this.quantity = quantity;
        this.taxAmount = taxAmount;
    }

    // method to calculate total charges
    double calculateTotal() {
        double total;
        total = (price * quantity) + taxAmount;
        return total;
    }
}
