public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
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
