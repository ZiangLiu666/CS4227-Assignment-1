package system;

import Interceptor.Application;

public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer("Jobs");
        Application app = new Application();

        app.addRentInterceptor(customer,new Movie("movie1",new ChildrenPrice()),"rent",5);
        app.addRentInterceptor(customer,new Movie("movie2",new NewReleasePrice()),"rent",3);
        app.addRentInterceptor(customer,new Movie("movie3",new RegularPrice()),"rent",6);


        app.addReturnInterceptor(customer,new Movie("movie3",null),"return");
        app.startInterceptor();


        System.out.println("TotalCharge: "+customer.getTotalCharge());
        System.out.println("TotalFrequentRenterPoints: "+customer.getTotalFrequentRenterPoints());


    }
}
