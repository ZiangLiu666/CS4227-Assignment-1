package Interceptor;

import system.Customer;
import system.Movie;
import system.RentMovie;
import system.ReturnMovie;

public class InterceptorImpl implements Interceptor {
    private Customer customer;
    public String request;
    private Movie movie;
    private int days;
    public InterceptorImpl(Customer customer,String request, Movie movie, int days){
        this.customer = customer;
        this.request = request;
        this.movie = movie;
        this.days = days;
    }
    @Override
    public void rentInterceptor() {
        customer.statement();
        this.rentInterceptor_event(customer,request,movie,days);
        new RentMovie(customer,movie,days).rent();
    }

    @Override
    public void returnInterceptor() {
        this.returnInterceptor_event(customer,request,movie);
        new ReturnMovie(customer,movie).returnMovie();
    }
    public void rentInterceptor_event(Customer customer,String request,Movie movie,int days){
        System.out.println("Customer "+customer.name + " want to rent "+ movie.title +" for "+days+" days. Price is "+movie.price.getCharge(days));
    }

    public void returnInterceptor_event(Customer customer,String request,Movie movie){
        System.out.println("Customer "+customer.name + " want to return "+ movie.title);
    }

}
