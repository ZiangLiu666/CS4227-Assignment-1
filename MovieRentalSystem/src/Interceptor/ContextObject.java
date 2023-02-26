package Interceptor;

import system.Customer;
import system.Movie;
//Context objects are mainly used to store some (initialized) information or methods
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
