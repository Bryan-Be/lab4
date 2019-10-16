import java.util.Scanner;

public class SquaredPowered{
   public static void main(String[] args){  
      Scanner scan = new Scanner(System.in); 
      String userQuest = "y";
      do{squaredPowered(scan);
      
      System.out.println("Do you want to continue if so press y. all others will terminate app");
       userQuest = scan.next();
      
      } while(userQuest.equals("y"));
      System.out.println("Thanks for using this app!!!");
     
        scan.close();
   }
   
   
   public static void squaredPowered(Scanner scn){
      
      
      System.out.println("Please enter a number up to ~1000: ");
      
      long valueToCountTo = scn.nextLong();
      
      System.out.println("  Number        Squared         Cubed");
      System.out.println("============  ============  ============");
      for (int i = 1; i <= valueToCountTo; i++) {
         int powered = i * i;
         int cubed = i * i * i;
         
         //System.out.println(i + "  " +powered+ "   "+cubed );
         System.out.printf("%1$-12d %2$-12d %3$-12d\n", i, powered, cubed );
        
      }

    
   }
}