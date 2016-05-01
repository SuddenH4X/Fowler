import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SuddenH4X on 01.05.2016.
 */
public class MovieTest {
    Movie movie = new Movie("The Avengers", 101010);

    @Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 101010);
    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(20);
        assertEquals(movie.getPriceCode(), 101010);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(movie.getTitle(), "The Avengers");
    }
}
