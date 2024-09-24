import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for maintenance costs for each season
        System.out.print("Enter the maintenance cost for Spring: $");
        double springCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Summer: $");
        double summerCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Fall: $");
        double fallCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Winter: $");
        double winterCost = scanner.nextDouble();

        double totalCost = springCost + summerCost + fallCost + winterCost;


        System.out.println ("Maintenance Costs");
        System.out.println ("Spring: " + springCost);
        System.out.println ("Summer: " + summerCost);
        System.out.println ("Fall: " + fallCost);
        System.out.println ("Winter: " +  winterCost);
        System.out.println ("Total Yearly Maintenance Cost: " + totalCost);

        scanner.close();
    }
}