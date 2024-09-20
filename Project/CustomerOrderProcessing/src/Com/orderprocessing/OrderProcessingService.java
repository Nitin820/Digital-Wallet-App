package Com.orderprocessing;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrderProcessingService {

    public static List<Order> getOrdersForCustomer(List<Customer> customers, int customerId) {
        return customers.stream()
                .filter(customer -> customer.getId() == customerId)
                .flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.toList());
    }

    public static double getTotalRevenue(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .mapToDouble(Order::getTotalPrice)
                .sum();
    }

    public static List<Order> getOrdersAbovePrice(List<Customer> customers, double minPrice) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getTotalPrice() > minPrice)
                .collect(Collectors.toList());
    }

    public static List<String> getAllItemsOrdered(List<Customer> customers) {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getItems().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<Customer, Double> getCustomerSpending(List<Customer> customers) {
        return customers.stream()
                .collect(Collectors.toMap(
                        customer -> customer,
                        customer -> customer.getOrders().stream()
                                .mapToDouble(Order::getTotalPrice)
                                .sum()
                ));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Order order1 = new Order(1, LocalDate.now(), 250.75, Arrays.asList("Laptop", "Mouse"));
        Order order2 = new Order(2, LocalDate.now().minusDays(2), 150.50, Arrays.asList("Keyboard", "Monitor"));
        Order order3 = new Order(3, LocalDate.now().minusDays(5), 320.20, Arrays.asList("Tablet", "Charger"));

        Customer customer1 = new Customer(1, "Akshay", Arrays.asList(order1, order2));
        Customer customer2 = new Customer(2, "Siddarth", Arrays.asList(order3));

        List<Customer> customers = Arrays.asList(customer1, customer2);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Get orders for a customer");
            System.out.println("2. Get total revenue");
            System.out.println("3. Get orders above a certain price");
            System.out.println("4. Get all unique items ordered");
            System.out.println("5. Get customer spending");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    List<Order> customerOrders = getOrdersForCustomer(customers, customerId);
                    if (customerOrders.isEmpty()) {
                        System.out.println("No orders found for customer ID: " + customerId);
                    } else {
                        System.out.println("Orders for Customer ID " + customerId + ":");
                        customerOrders.forEach(System.out::println);
                    }
                    break;

                case 2:
                    System.out.println("Total Revenue: " + getTotalRevenue(customers));
                    break;

                case 3:
                    System.out.print("Enter minimum price: ");
                    double minPrice = scanner.nextDouble();
                    List<Order> expensiveOrders = getOrdersAbovePrice(customers, minPrice);
                    if (expensiveOrders.isEmpty()) {
                        System.out.println("No orders found above price: " + minPrice);
                    } else {
                        System.out.println("Orders above price " + minPrice + ":");
                        expensiveOrders.forEach(System.out::println);
                    }
                    break;

                case 4:
                    List<String> uniqueItems = getAllItemsOrdered(customers);
                    System.out.println("Unique items ordered:");
                    uniqueItems.forEach(System.out::println);
                    break;

                case 5:
                    Map<Customer, Double> customerSpending = getCustomerSpending(customers);
                    System.out.println("Customer Spending:");
                    customerSpending.forEach((customer, spending) ->
                            System.out.println(customer.getName() + " spent: $" + spending));
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
