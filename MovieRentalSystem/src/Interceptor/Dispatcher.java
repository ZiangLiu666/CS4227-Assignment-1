package Interceptor;

import system.Customer;
import system.Movie;
import system.RentMovie;
import system.ReturnMovie;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private List<InterceptorImpl> interceptorList;


    // Initialisation
    public Dispatcher() {
        interceptorList = new ArrayList<InterceptorImpl>();
    }

    public void registerInterceptor(InterceptorImpl i) {
        interceptorList.add(i);
    }

    public void removeInterceptor(InterceptorImpl i) {
        interceptorList.remove(i);
    }

    public List<InterceptorImpl> interceptorList() {
        return interceptorList;
    }

    public void dispatch(){
        for(InterceptorImpl i:interceptorList){
            if(i.request.equals("rent")){
                i.rentInterceptor();
            }
            if(i.request.equals("return")){
                i.returnInterceptor();
            }
        }
    }
}
