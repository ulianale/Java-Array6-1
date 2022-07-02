import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        System.out.println(service.sumAllSales(sales));

        System.out.println(service.averageSumInMonth(sales));

        System.out.println(service.maxMonth(sales));

        System.out.println(service.minMonth(sales));

        System.out.println(service.amountMonthLowerAverage(sales));

        System.out.println(service.amountMonthUpperAverage(sales));
    }
}
