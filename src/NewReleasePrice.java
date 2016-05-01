/**
 * Created by SuddenH4X on 02.05.2016.
 */
public class NewReleasePrice extends Price{

    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented){
        return daysRented * 3;
    }

}
