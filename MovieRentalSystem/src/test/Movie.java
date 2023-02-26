package test;

public class Movie {
    String title;
    Price price;

    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public double getCharge(int days){
        return price.getCharge(days);
    }

    public int getFrequentRenterPoints(int days){
        return price.getFrequentRenterPoints(days);
    }
}
