import java.util.Scanner;
public class ElectricityUsageReport {
    public static void main(String[] args){
        double total_cost;
        double usage;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter customer number: ");
        String customer_num = keyboard.next();

        keyboard.nextLine();
        System.out.print("Please enter Customer Name: ");
        String customer_name = keyboard.nextLine();

        System.out.print("Please enter electricity usage for the month: ");
        usage = keyboard.nextDouble();

        if (usage > 200){
            total_cost = 200 * 0.11;
            total_cost = total_cost + ((usage-200) * 0.08);
        }
        else{
            total_cost = usage * 0.11;
        }

        System.out.printf("\nCustomer number: %s \nCustomer name: %s \nElectricity usage: %f \nAmount owed: $%f", customer_num, customer_name, usage, total_cost);


    }
}
