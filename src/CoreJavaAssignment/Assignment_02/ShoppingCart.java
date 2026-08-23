package CoreJavaAssignment.Assignment_02;

public class ShoppingCart {

    // 1. Calculate total price for same item
    public double calculateTotal(int quantity, double pricePerUnit) {

        double total = quantity * pricePerUnit;

        return total;
    }


    // 2. Calculate total price with percentage discount
    public double calculateTotal(double pricePerUnit,
                                 int quantity,
                                 double discountPercentage) {

        double total = pricePerUnit * quantity;

        double discount = total * discountPercentage / 100;

        double finalAmount = total - discount;

        return finalAmount;
    }


    // 3. Calculate total price for different items
    public double calculateTotal(double[] prices) {

        double total = 0;

        for (int i = 0; i < prices.length; i++) {

            total = total + prices[i];
        }

        return total;
    }


    // 4. Calculate total price using quantities and prices
    public double calculateTotal(int[] quantities,
                                 double[] prices) {

        double total = 0;

        for (int i = 0; i < quantities.length; i++) {

            double itemTotal = quantities[i] * prices[i];

            total = total + itemTotal;
        }

        return total;
    }


    // 5. Calculate total with individual discount
    public double calculateTotal(int[] quantities,
                                 double[] prices,
                                 double[] discountPercentages) {

        double total = 0;

        for (int i = 0; i < quantities.length; i++) {

            double itemTotal = quantities[i] * prices[i];

            double discount =
                    itemTotal * discountPercentages[i] / 100;

            double finalItemPrice = itemTotal - discount;

            total = total + finalItemPrice;
        }

        return total;
    }


    // 6. Calculate total using coupon code
    public String calculateTotal(String couponCode,
                                 double totalAmount) {

        double discountPercentage = 0;

        if (couponCode.equals("SAVE10")) {

            discountPercentage = 10;

        } else if (couponCode.equals("SAVE20")) {

            discountPercentage = 20;

        } else {

            discountPercentage = 0;
        }

        double discount =
                totalAmount * discountPercentage / 100;

        double finalAmount =
                totalAmount - discount;

        return "Coupon Code: " + couponCode
                + "\nOriginal Amount: " + totalAmount
                + "\nDiscount: " + discountPercentage + "%"
                + "\nFinal Payable Amount: " + finalAmount;
    }
}