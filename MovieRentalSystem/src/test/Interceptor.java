package test;

public class Interceptor implements Logger {


    @Override
    public void intercept(Customer customer,String request,Movie movie,int days) {
        if (request.equals("rent")){
            if (days<=0){
                throw new IllegalArgumentException("rent days must be positive");
            }
        }
        if (!request.equals("rent")&&!request.equals("return")){
            throw new IllegalArgumentException("request must be rent or return");
        }
        customer.statement();
        this.log(customer,request,movie,days);

        new Dispatcher().dispat(customer,request,movie,days);

    }

    public void log(Customer customer,String request,Movie movie,int days){
        if (request.equals("rent")){
            System.out.println("Customer "+customer.name + " want to rent "+ movie.title +" for "+days+" days. Price is "+movie.price.getCharge(days));
        }else if (request.equals("return")){
            System.out.println("Customer "+customer.name + " want to return "+ movie.title);

        }


    }


}
