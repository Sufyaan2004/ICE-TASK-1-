//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class ShoeSalesAnalysis {

    public static void main(String[] args) {
        String[] brands = {"Nike", "Adidas", "Reebok"};

        int[] nike   = {100, 88, 75, 65};
        int[] adidas = {150, 92, 45, 95};
        int[] reebok = {70, 103, 90, 175};

        int[][] salesData = {nike, adidas, reebok};

        // Display quarterly sales table
        System.out.println("===== Quarterly Sales Figures =====");
        System.out.printf("%-8s%-10s%-10s%-10s%n", "", "NIKE", "ADIDAS", "REEBOK");
        for (int q = 0; q < 4; q++) {
            System.out.printf("%-8s%-10d%-10d%-10d%n",
                    "Q" + (q + 1), nike[q], adidas[q], reebok[q]);
        }

        // Display total, average, min, max for each brand
        System.out.println("\n===== Sales Summary =====");
        for (int i = 0; i < brands.length; i++) {
            int[] sales = salesData[i];

            int total = calculateTotal(sales);
            double average = calculateAverage(sales, total);
            int min = findMin(sales);
            int max = findMax(sales);

            System.out.println("\nBrand: " + brands[i]);
            System.out.println("  Total Sales   : " + total);
            System.out.printf("  Average Sales : %.2f%n", average);
            System.out.println("  Minimum Sale  : " + min);
            System.out.println("  Maximum Sale  : " + max);
        }
    }

    // Calculates the total sales for a brand
    public static int calculateTotal(int[] sales) {
        int total = 0;
        for (int value : sales) {
            total += value;
        }
        return total;
    }

    // Calculates the average sales for a brand
    public static double calculateAverage(int[] sales, int total) {
        return (double) total / sales.length;
    }

    // Finds the minimum sale value for a brand
    public static int findMin(int[] sales) {
        int min = sales[0];
        for (int value : sales) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Finds the maximum sale value for a brand
    public static int findMax(int[] sales) {
        int max = sales[0];
        for (int value : sales) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
