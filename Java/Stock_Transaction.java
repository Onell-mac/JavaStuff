public class Stock_Transaction {
    public static void main(String [] args){
        // Joe purchased was 1,000 shares
        // Joe purchased the stock, he paid $32.87 per share
        // Joe paid his stockbroker 2% of the amount he paid for the stock

        // Joe sold 1000 shares
        // Joe sold the stock for $33.92 per share
        // Joe paid his stockbroker another 2% of the amount he recieved for the stock

        int purchased = 1000;
        double paid = 32.87;
        double firstCommission = .02;

        int sold = 1000;
        double stockSold = 33.92;
        double secondComission = .02;

        double amountPaid =  (purchased * paid);
        System.out.println("\n The amount Joe paid was $" + amountPaid);

        double commission = (amountPaid*firstCommission);
        System.out.println("\n The comission Joe had to pay to his broker when he bought the stock $" + commission);

        double amountSold = (stockSold*sold);
        System.out.println("\n Amount he sold the stocks for $"+ amountSold);

        double commissionSold = (amountSold*secondComission);
        System.out.println("\n Second commission after sold $"+ commissionSold);

        double profit = (amountSold-commission-commissionSold-amountPaid);
        System.out.println("\n Profit $"+ profit);




    }
    
}
