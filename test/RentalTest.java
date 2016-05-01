import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SuddenH4X on 01.05.2016.
 */
public class RentalTest {
    Movie movie = new Movie("The Avengers", 101010);
    Rental rental = new Rental(movie, 42);

    @Test
    public void getDaysRented() throws Exception {
        assertEquals(rental.getDaysRented(), 42);
    }

    @Test
    public void getMovie() throws Exception {
        assertEquals(rental.getMovie(), movie);
    }
}
