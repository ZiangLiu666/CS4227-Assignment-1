package test;

public class Dispatcher {

    public void dispat(Customer customer,String request,Movie movie,int days){
        if (request.equals("rent")){
            new RentMovie(customer,movie,days).rent();
        }else if (request.equals("return")){
            new ReturnMovie(customer,movie).returnMovie();
        }
    }
}
