import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SuddenH4X on 01.05.2016.
 */
public class CustomerTest {
    Customer customer = new Customer("Max Mustermann");
    Movie movie = new Movie("The Avengers", 101010);
    Rental rental = new Rental(movie, 42);

    @Test
    public void addRental() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for Max Mustermann\n" + "\tTitle\t\tDays\tAmount\n" +
                "\tThe Avengers\t\t42\t0.0\n" + "Amount owed is 0.0\n" + "You earned 1 frequent renter points");
    }

    @Test
    public void getName() throws Exception {
        assertEquals(customer.getName(), "Max Mustermann");
    }

    @Test
    public void statement() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for Max Mustermann\n" + "\tTitle\t\tDays\tAmount\n" +
                "\tThe Avengers\t\t42\t0.0\n" + "Amount owed is 0.0\n" + "You earned 1 frequent renter points");
    }

}
