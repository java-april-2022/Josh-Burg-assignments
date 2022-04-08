import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestCafe {
    public static void main(String[] args) {
        CafeUtil link = new CafeUtil();

        System.out.println("\n--- Streak Goal Test---");
        System.out.printf("Purchases needed by week 10: %s \n\n", link.getStreakGoal());

        System.out.println("\n--- Order Total Test---");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", link.getOrderTotal(lineItems));

        System.out.println("\n--- Display Menu Test---");
        List<String> loadMenu = Arrays.asList("drip coffee", "cappuccino", "latte", "mocha");

        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        link.displayMenu(menu);

        System.out.println("\n--- Add Customer Test---");
        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            link.addCustomer(customers);
            System.out.println("\n");
        }

    }

}

