package java_labs.Lab6.ex3;

import java.util.*;

public class Shop {
    private final LinkedHashMap<String, Integer> sales;
    private final Map<String, Double> prices;

    public Shop() {
        sales = new LinkedHashMap<>();
        prices = new HashMap<>();
    }

    public void addProduct(String product, double price) {
        prices.put(product, price);
        sales.putIfAbsent(product, 0);
    }

    public void sellProduct(String product, int quantity) {
        if (!sales.containsKey(product)) {
            System.out.println("Товар не найден: " + product);
            return;
        }
        sales.put(product, sales.get(product) + quantity);
    }

    public void displaySales() {
        System.out.println("Проданные товары:");
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " шт.");
        }
    }

    public double calculateTotalSales() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            total += prices.get(product) * quantity;
        }
        return total;
    }

    public String getMostPopularProduct() {
        String mostPopular = null;
        int maxSales = 0;

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostPopular = entry.getKey();
            }
        }
        return mostPopular != null ? mostPopular : "Нет продаж";
    }
}