package java_labs.Lab6.ex3;

public class Main {
    public static void main(String[] args) {
        Shop tracker = new Shop();

        tracker.addProduct("Хлеб", 30.0);
        tracker.addProduct("Молоко", 50.0);
        tracker.addProduct("Яблоки", 20.0);

        tracker.sellProduct("Хлеб", 10);
        tracker.sellProduct("Молоко", 5);
        tracker.sellProduct("Яблоки", 12);
        tracker.sellProduct("Хлеб", 3);

        tracker.displaySales();

        System.out.println("Общая сумма продаж: " + tracker.calculateTotalSales() + " руб.");

        System.out.println("Самый популярный товар: " + tracker.getMostPopularProduct());
    }
}
