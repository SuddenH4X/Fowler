
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints ++;
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double amountFor(Rental aRental) {
        return aRental.getCharge();
    }
}