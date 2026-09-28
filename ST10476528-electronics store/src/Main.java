//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void
    main(String[] args) {

        String[] cities = {"Cape Town",
                "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5",
                "Xbox","Switch"};

        int[][] sales = {{1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        System.out.println("---------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------");

        int[] cityTotals = new int[cities.length];
        System.out.printf("%-20s", "");
        for (String console : consoles) {
            System.out.printf("%-15s", console);
        }
        for (int i = 0; 1 < cities.length; i++) {
            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-15d", sales[i][j]);
                cityTotals[i] += sales[i][j];

            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("CONSOLE SALE TOTAL FOR EACH CITY");
        System.out.println("---------------------------------------------------------");
        int highestSales = cityTotals[0];
        int highestCityIndex = 0;
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n", cities[i], cityTotals[i]);
            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                highestCityIndex = i;
            }
        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestCityIndex]);
        System.out.println("---------------------------------------------------------");
    }
}
