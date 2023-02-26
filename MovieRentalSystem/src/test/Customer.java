package test;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    List<RentRecord> rentRecords = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void statement(){
        if (this.rentRecords.size()==0){
            return;
        }
        System.out.println("Customer "+getName() + " rent :");
        for (RentRecord rentRecord : rentRecords) {
            System.out.println(rentRecord.movie.title+"\t"+ rentRecord.daysRented+" days");
        }
        System.out.println("Total cost is "+ getTotalCharge());
        System.out.println("Total FrequencyRenterPoints is "+getTotalFrequentRenterPoints());

    }

    public double getTotalCharge(){
        double price= 0;
        for (RentRecord rentRecord : rentRecords) {
            price+= rentRecord.getCharge();
        }
        return price;
    }

    public int getTotalFrequentRenterPoints(){
        int totalFrequentRenterPoints = 0;
        for (RentRecord rentRecord : rentRecords) {
            totalFrequentRenterPoints+= rentRecord.getFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    public String getName() {
        return name;
    }
}
