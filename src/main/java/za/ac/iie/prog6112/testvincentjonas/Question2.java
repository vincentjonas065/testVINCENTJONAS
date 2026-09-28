package za.ac.iie.prog6112.testvincentjonas;

/**
 *
 * @author Student
 */
/**
 *
 * @author Student
 */

 import java.util.Scanner;
public class Question2 {
    
    public interface Iconsole {
        String getConsoleType ();
        String getStore ();
        int getTotalSales ();
    }
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Select console type:");
    System.out.println("1. PS5");
    System.out.println("2. Xbox");
    System.out.println("3. Switch");
    System.out.print("Enter choice: ");
    int choice = scanner.nextInt();
    scanner.nextLine();
    
    String consoleType = "";
    switch(choice) {
        case 1:
            consoleType = "PS5";
            break;
        case 2:
            consoleType = "Xbox";
            break;
        case 3:
            consoleType = "Switch";
            break;
        default:
            System.out.println("Invalid choice");
            return;
    }
    
    System.out.print("Enter store number: ");
    String store = scanner.nextLine();
    
    System.out.print("Enter total sales: ");
    int totalSales = scanner.nextInt();
    
    System.out.println("\nConsole: " + consoleType);
    System.out.println("Store: " + store);
    System.out.println("Total Sales: " + totalSales);
    
    scanner.close();
    }}




