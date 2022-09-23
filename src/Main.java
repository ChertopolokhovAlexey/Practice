public class Main {
    public static void main(String[] args) {
        int[] sales = {100, 200, 350, 10};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.statAverage());
    }
}
