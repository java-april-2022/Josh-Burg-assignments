import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for(int week = 1; week <= 10; week++) {
            sum += week;

        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for (double price: lineItems) {
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for ( int m = 0; m < menuItems.size(); m++) {
            System.out.printf("%s %s \n", m, menuItems.get(m));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people ahead of you.\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> priceIndex) {
        if(menuItems.size() != priceIndex.size()) {
            return false;
        }
        for (int m = 0; m < menuItems.size(); m++) {
            System.out.printf("%s %s -- %s.2f\n", m, menuItems.get(m), priceIndex.get(m));
        }
        return true;

    }

}