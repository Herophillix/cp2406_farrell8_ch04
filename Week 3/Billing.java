public class Billing {
    public static void main(String[] args) {

    }

    public double computeBill(double price)
    {
        return price * 1.08;
    }

    public double computeBill(double price, int quantity)
    {
        return price * 1.08 * quantity;
    }

    public double computeBill(double price, int quantity, double couponDiscount)
    {
        return (price * quantity - couponDiscount) * 1.08;
    }

}