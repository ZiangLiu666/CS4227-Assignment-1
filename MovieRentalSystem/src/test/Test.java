package test;

public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer("Ziang");
        Application app = new Application();

        app.sendRequest(customer,new Movie("movie1",new ChildrenPrice()),"rent",5);
        app.sendRequest(customer,new Movie("movie2",new NewReleasePrice()),"rent",3);
        app.sendRequest(customer,new Movie("movie3",new RegularPrice()),"rent",6);




        System.out.println("TotalCharge: "+customer.getTotalCharge());
        System.out.println("TotalFrequentRenterPoints: "+customer.getTotalFrequentRenterPoints());


    }
}
