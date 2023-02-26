package system;

public class RentRecord {
    int daysRented;
    Movie movie;

    public RentRecord(int daysRented, Movie movie) {
        this.daysRented = daysRented;
        this.movie = movie;
    }

    public double getCharge(){
        if (daysRented<=0){
            return 0;
        }
        return movie.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(){
        if (daysRented<=0){
            return 0;
        }
        return movie.getFrequentRenterPoints(daysRented);
    }
}
