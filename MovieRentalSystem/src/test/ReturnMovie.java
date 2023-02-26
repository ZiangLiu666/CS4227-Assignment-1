package test;

public class ReturnMovie {
    Customer customer;
    Movie movie;

    public ReturnMovie(Customer customer, Movie movie) {
        this.customer = customer;
        this.movie = movie;
    }

    public void returnMovie(){
        this.customer.rentRecords.remove(this.movie);
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
}
