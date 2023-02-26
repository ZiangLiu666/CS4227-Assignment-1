package system;

public class RentMovie {
    Customer customer;
    Movie movie;
    int days;

    public RentMovie(Customer customer, Movie movie, int days) {
        this.customer = customer;
        this.movie = movie;
        this.days = days;
    }

    public void rent(){
        this.customer.rentRecords.add(new RentRecord(this.days,this.movie));
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
