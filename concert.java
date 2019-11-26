package com.company;

public class Concert {

    public static void main(String[] args) {

        //creating objects of class ticket
        ticket generalAdmission = new ticket(200.50, 8, 16.04);
        ticket vip = new ticket(400.50, 8, 32.04);
        ticket reservedSeating = new ticket(600.50, 8, 48.04);

        System.out.println("Listing of All Packages (packages include 8 tickets)");

// calling method
        System.out.println("\nGeneral Admission Package - Total Charges: $" + generalAdmission.calculateTotal());

        System.out.println("VIP Package - Total Charges: $" + vip.calculateTotal());

        System.out.println("Reserved Seating Package - Total Charges: $" + reservedSeating.calculateTotal());
    }
}

class ticket {
    double price;                //price of each ticket
    int quantity;               //number of tickets
    double taxAmount;          //tax imposed

    //constructor
    ticket(double price, int quantity, double taxAmount) {
        this.price = price;
        this.quantity = quantity;
        this.taxAmount = ta;
    }

    // method to calculate total charges
    double calculateTotal() {
        double total;
        total = (price * quantity) + taxAmount;
        return total;
    }
}
