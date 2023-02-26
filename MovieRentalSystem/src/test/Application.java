package test;

public class Application {

    public void sendRequest(Customer customer,Movie movie,String request,int days){


        new Interceptor().intercept(customer,request,movie,days);

    }

}
