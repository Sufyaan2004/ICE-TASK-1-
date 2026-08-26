// ShoeSalesApplication.java
public class ShoeSalesApplication {
    public static void main(String[] args) {
        // Sales data for each brand by quarter
        int[][] salesData = {
                {100, 150, 70},   // Q1: Nike, Adidas, Reebok
                {88, 92, 103},    // Q2: Nike, Adidas, Reebok
                {75, 45, 90},     // Q3: Nike, Adidas, Reebok
                {65, 95, 175}     // Q4: Nike, Adidas, Reebok
        };

        String[] brands = {"NIKE", "ADIDAS", "REEBOK"};
        String[] quarters = {"Q1", "Q2", "Q3", "Q4"};

        // Display header
        System.out.println("ULTIMATE SHOE SALES");
        System.out.println("=".repeat(50));

        // Display table header
        System.out.printf("%-10s", "QUARTER");
        for (String brand : brands) {
            System.out.printf("%-12s", brand);
        }
        System.out.println();
        System.out.println("-".repeat(50));

        // Display quarterly sales data
        for (int i = 0; i < quarters.length; i++) {
            System.out.printf("%-10s", quarters[i]);
            for (int j = 0; j < brands.length; j++) {
                System.out.printf("%-12d", salesData[i][j]);
            }
            System.out.println();
        }

        System.out.println("=".repeat(50));
        System.out.println();

        // Calculate and display statistics for each brand
        System.out.println("SALES STATISTICS");
        System.out.println("-".repeat(50));

        for (int j = 0; j < brands.length; j++) {
            int total = 0;
            int min = salesData[0][j];
            int max = salesData[0][j];

            for (int i = 0; i < salesData.length; i++) {
                total += salesData[i][j];
                if (salesData[i][j] < min) min = salesData[i][j];
                if (salesData[i][j] > max) max = salesData[i][j];
            }

            double average = (double) total / salesData.length;

            System.out.println(brands[j] + ":");
            System.out.printf("  Total: %d%n", total);
            System.out.printf("  Average: %.2f%n", average);
            System.out.printf("  Minimum: %d%n", min);
            System.out.printf("  Maximum: %d%n", max);
            System.out.println();
        }
    }
}
