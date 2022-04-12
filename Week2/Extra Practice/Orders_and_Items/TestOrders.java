import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 4.5;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 2.5;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 5;

                // First Attempt - Royally screwed up
        // // Order variables -- order1, order2 etc.
        // Order order1 = new Order();
        // order1.name = "Cindy";
        // // order1.total = 3.5;
        // // order1.ready = true;
        // // order1.items = ;

        // Order order2 = new Order();
        // order2.name = "Jimmy";
        // // order2.total = 4.5;
        // // order2.ready = false;
        // // order2.items = item2;

        // Order order3 = new Order();
        // order3.name = "Noah";
        // // order3.total = 4.5;
        // // order3.ready = false;
        // // order3.items = item2;

        // Order order4 = new Order();
        // order4.name = "Sam";
        // // order4.total = 5;
        // // order4.ready = false;
        // // order4.items = item4;

        Order order1 = new Order(); // had to change spelling because it gave my laptop an error
        order1.name = "Cindy";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";


            // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
            // After the solution video this makes sense

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item4.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price *2;

        order2.ready = true;


        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}