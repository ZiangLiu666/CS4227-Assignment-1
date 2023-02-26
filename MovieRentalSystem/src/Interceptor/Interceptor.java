package Interceptor;

import system.Customer;
import system.Movie;
/**
 * Define two interception groups to intercept rental and return operations by system users
 */
public interface Interceptor {

    public void rentInterceptor();//Pre-rental interceptions
    public void returnInterceptor();//Pre-return interception

}
