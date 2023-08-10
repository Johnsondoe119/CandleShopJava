import java.text.DecimalFormat;

// Define the Candle class
class Candle {
    String name;
    int quantity;
    double burnTime;
    double dollarPerBurnTime;
    double price;

    // Constructor to initialize the Candle object
    Candle(String name, int quantity, double burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
        this.dollarPerBurnTime = price / burnTime; // Calculate dollar per burn time
    }

    // Calculate the subtotal price for the candles
    double getSubtotal() {
        return price * quantity;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of the Candle class
        Candle candle1 = new Candle("Ocean Lavender", 4, 6, 8.50);
        Candle candle2 = new Candle("Fragrant Glacier", 3, 8, 19.75);
        Candle candle3 = new Candle("Spicy Forest", 4, 15, 14.98);

        // Create additional instances of the Candle class
        Candle candle4 = new Candle("Ocean Breeze", 4, 8, 14.99);
        Candle candle5 = new Candle("Sweet Serenity", 1, 10, 9.99);

        // Calculate total burn time for all candles
        int totalBurnTime = (int) (candle1.burnTime * candle1.quantity +
                candle2.burnTime * candle2.quantity +
                candle3.burnTime * candle3.quantity +
                candle4.burnTime * candle4.quantity +
                candle5.burnTime * candle5.quantity);

        // Calculate total dollar per burn time for all candles
        double totalDollarPerBurnTime = (candle1.price + candle2.price + candle3.price
                + candle4.price + candle5.price) / totalBurnTime;

        // Calculate total price for all candles
        double totalPrice = candle1.getSubtotal() + candle2.getSubtotal() + candle3.getSubtotal()
                + candle4.getSubtotal() + candle5.getSubtotal();

        // Create a DecimalFormat object for formatting currency values
        DecimalFormat df = new DecimalFormat("#.##");

        // Format the total dollar per burn time
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);

        // Print receipt header
        System.out.println("Receipt\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Print details for existing candles (candle1, candle2, candle3)
        System.out.println(candle1.name);
        // ...
        System.out.println(candle2.name);
        // ...
        System.out.println(candle3.name);
        // ...

        // Print separator for additional candles
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        // Print details for additional candles (candle4, candle5)
        System.out.println(candle4.name);
        // ...
        System.out.println(candle5.name);
        // ...

        // Print separator for totals
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        // Print total burn time, total dollar per burn time, and total price
        System.out.println("Total Burn Time: " + totalBurnTime);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);
    }
}
