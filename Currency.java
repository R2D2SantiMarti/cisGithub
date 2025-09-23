/**
 * Description: this program converts currency
 * @author Jeffrey Chen 
 * @author: Arturo S. 
 * @since 9/17/2025
 */

import java.util.Scanner; 

public class Currency {
    public static void welcome() { 
        System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
        System.out.println("This program converts following currency to USD in both way:"); 
        System.out.println("Japanese Yen and Taiwan Dollar."); 
        System.out.println("+++++++++++++++++++++++++++++++++++++++\n"); 
         
    }

     
    static final double DOLLAR_YEN_RATIO = 147.71;
    static final double DOLLARS_TWD_RATIO = 30.31 ; 

    public static double yen_to_dollar(double yen) {
        return yen / DOLLAR_YEN_RATIO;
    }

    public static double dollar_to_yen(double dollar) {
        return dollar * DOLLAR_YEN_RATIO;
    }

    public static double twd_to_dollar(double twd) {
        return twd / DOLLARS_TWD_RATIO;
    }

    public static double dollar_to_twd(double dollar) {
        return dollar * DOLLARS_TWD_RATIO;
    }


/**
* This method receives the option input by user and choose type of conversion
* @param int 1-4
* @return input conversion method
*/

public static int menu(Scanner input) {
    System.out.println("What type of conversion you want?");
    System.out.println("1. Dollar to Taiwan Dollar");
    System.out.println("2. Taiwan Dollar to Dollar");
    System.out.println("3. Dollar to Yen");
    System.out.println("4. Yen to Dollar");
    System.out.print("Please enter number 1-4: ");
    return input.nextInt();
}

    /** 
    * Main method 
    * @param args command line arguments
    */

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); //instatiating a scanner object
        welcome(); //function call 
        int choice = menu(in);
        double value; 

        switch (choice) { 
            case 1:            
                System.out.println("How much USD would you like to convert to Taiwanese dollars?"); 
                value = in.nextDouble();
                System.out.printf(" The conversion of USD to Taiwanese dollars is: %.2f\n", dollar_to_twd(value)); 
                break; 

            case 2: 
                System.out.println("How much TWD would you like to convert to U.S. dollars?"); 
                value = in.nextDouble(); 
                System.out.printf(" The conversion of Taiwanese dollars to USD is: %.2f\n", twd_to_dollar(value)); 
                break;

            case 3:
                System.out.println("How much USD would you like to convert to Yen?"); 
                value = in.nextDouble();
                System.out.printf("The conversion of USD to Yen is: %.2f\n", dollar_to_yen(value));
                break;

            case 4:
                System.out.println("How much Yen would you like to convert to USD?"); 
                value = in.nextDouble();
                System.out.printf("The conversion of Yen to USD is: %.2f\n", yen_to_dollar(value));
            break;

            default: 
            System.out.println("Please choose between 1 and 4, thanks!");
        }
        in.close();
    }

}
