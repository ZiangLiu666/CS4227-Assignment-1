package system;

public class RegularPrice extends Price {
    @Override
    public double getCharge(int days) {
        double price = 2;
        if (days>2){
            price += (days-2)*1.5;
        }
        return price;
    }
}
