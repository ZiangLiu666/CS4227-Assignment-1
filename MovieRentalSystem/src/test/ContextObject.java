package test;

public class ContextObject {
    private Movie movie;
    private Customer customer;

    public ContextObject(Movie movie, Customer customer) {
        this.movie = movie;
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
