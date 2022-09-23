public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int statAverage() {
        int statAverage = 0;
        int min = max();
        int total = 0;
        for (int sale : sales) {
            total += sale;
            if (sale < min) {
                min = sale;
            }
        }
        statAverage = (total - min - max()) / (sales.length - 2);
        return statAverage;
    }

}
