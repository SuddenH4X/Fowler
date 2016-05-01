/**
 * Created by SuddenH4X on 02.05.2016.
 */
abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}
