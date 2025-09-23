/** 
 * Description: this program converts currency
 * @author Jeffrey Chen 
 * @author Arturo S. 
 * @since 9/17/2025
 */

public class Currency { 
    public static void welcome() { 
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        System.out.println("This program converts following currency to USD in both way:"); 
        System.out.println("Taiwan Dollar and Japanese Yen."); 
        System.out.println("+++++++++++++++++++++++++++++++++++++++");  
    }

public class Conversion {
     
    static final double DOLLAR_YEN_RATIO = 147.71;
    static final double DOLLARS_TWD_RATIO = 30.29 ;

    public static double twd_to_dollar(double yen) {
        return yen / DOLLAR_YEN_RATIO;
    }

    public static double dollar_to_twd(double dollar) {
        return dollar * DOLLAR_YEN_RATIO;
    }
    
    /**
    * This method receives the option input by user and choose type of conversion
    * @param int 1-4
    * @return input conversion method
    */
    
    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of conversion you want?");
        System.out.println("1. Yen to Dollar");
        System.out.println("2. Dollar to Yen");
        System.out.println("3. Taiwan Dollar to Dollar");
        System.out.println("4. Dollar to Taiwan Dollar");
        System.out.println("Please enter number 1-4: ");
        return input.nextInt();
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
        int choice = menu();
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

