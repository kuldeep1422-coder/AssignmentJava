package CoreJavaAssignment.Assignment_02;

public class Test {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();


        // 1. Same item with quantity and price

        double total1 =
                shoppingCart.calculateTotal(5, 100);

        System.out.println("1. Same Item Total: " + total1);


        // 2. Same item with discount

        double total2 =
                shoppingCart.calculateTotal(100, 5, 10);

        System.out.println("2. Discounted Item Total: " + total2);


        // 3. Different items

        double[] prices = {
                100,
                200,
                300
        };

        double total3 =
                shoppingCart.calculateTotal(prices);

        System.out.println("3. Different Items Total: " + total3);


        // 4. Multiple items with different quantities

        int[] quantities = {
                2,
                3,
                4
        };

        double[] itemPrices = {
                100,
                200,
                50
        };

        double total4 =
                shoppingCart.calculateTotal(
                        quantities,
                        itemPrices
                );

        System.out.println("4. Multiple Items Total: " + total4);


        // 5. Multiple items with individual discounts

        double[] discounts = {
                10,
                20,
                5
        };

        double total5 =
                shoppingCart.calculateTotal(
                        quantities,
                        itemPrices,
                        discounts
                );

        System.out.println(
                "5. Individual Discount Total: "
                        + total5
        );


        // 6. Coupon SAVE10

        String coupon1 =
                shoppingCart.calculateTotal(
                        "SAVE10",
                        1000
                );

        System.out.println("\n6. SAVE10 Coupon:");
        System.out.println(coupon1);


        // 7. Coupon SAVE20

        String coupon2 =
                shoppingCart.calculateTotal(
                        "SAVE20",
                        1000
                );

        System.out.println("\n7. SAVE20 Coupon:");
        System.out.println(coupon2);


        // 8. Invalid coupon

        String coupon3 =
                shoppingCart.calculateTotal(
                        "ABC",
                        1000
                );

        System.out.println("\n8. Invalid Coupon:");
        System.out.println(coupon3);
    }
}