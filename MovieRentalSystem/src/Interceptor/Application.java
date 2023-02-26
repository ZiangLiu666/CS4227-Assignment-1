package Interceptor;

import system.Customer;
import system.Movie;

public class Application {

    private Dispatcher dispatcher;

    // Initialisation
    public Application() {
        dispatcher = new Dispatcher();
    }

    public void addRentInterceptor(Customer customer, Movie movie, String request, int days){
        dispatcher.registerInterceptor(new InterceptorImpl(customer,request,movie,days));
    }

    public void addReturnInterceptor(Customer customer, Movie movie, String request){
        dispatcher.registerInterceptor(new InterceptorImpl(customer,request,movie,0));
    }

    public void startInterceptor(){
        dispatcher.dispatch();
    }

}
