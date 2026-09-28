
package za.ac.iie.prog6112.testvincentjonas;

/**
 *
 * @author Student
 */
public class TestVINCENTJONAS {public static void main(String[] args) {
    
    
        // Sales data for 3 cities and 3 consoles
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "Xbox", "Nintendo Switch"};
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
         System.out.println("---------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
         System.out.println("---------------------------------------------------------------------");
         
         
        System.out.printf("City", "PS5", "Xbox", "Nintendo Switch", "Total");
        
        
        System.out.println("---------------------------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            int total = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.printf(cities[i], sales[i][0], sales[i][1], sales[i][2], total);
            
          System.out.println("---------------------------------------------------------------------");
          System.out.println("CONSOLE SALES TOTAL EACH CITY"); 
          System.out.println("---------------------------------------------------------------------");
        
           System.out.println("");
        }
        
    }
     
    
}