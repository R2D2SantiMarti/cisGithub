import java.util.Scanner; 

/* Description: this program converts currency
 * Author: Jeff Chen 
 * Author: Arturo S. 
 * Since: 9/17/2025
 */

public class Currency {
    static final double DOLLARS_TWD_RATIO = .0033 ; 
    public static void welcome() { 
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        System.out.println("This program converts currency from TWD to USD."); 
        System.out.println("Or this program will convert from USD to TWD."); 
        System.out.println("+++++++++++++++++++++++++++++++++++++++");  
    }


        /** 
         * Main method 
         * @param args command line arguments
         */

         public static void main(String[] args) {
          
        welcome(); //function call 
        System.out.println("Enter the type of currency to convert.");
        System.out.println("If USD, enter: 1 ");
        System.out.println("If TWD, enter: 2 ");  
        Scanner in = new Scanner(System.in); //instatiating a scanner object 
        int choice = in.nextInt();
        int value; 

        switch (choice ) { 
            case 1 :            
             System.out.println("How much USD would you like to convert to Taiwanese dollars?"); 
              value = in.nextInt();

             System.out.println(" The conversion of U.S. dollars to Taiwanese dollars is: " + value / DOLLARS_TWD_RATIO); 
        
            break; 

            case 2 : 
                System.out.println("How much TWD would you like to convert to U.S. dollars?"); 
                value = in.nextInt(); 

                System.out.println(" The conversion of Taiwanese dollars to USD is: " + value * DOLLARS_TWD_RATIO); 
            
            break;
            default: 
            System.out.println("No value returned.");
        }

    
        in.close();

         }

}
