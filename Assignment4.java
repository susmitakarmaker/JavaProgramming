
package begineerjava;

import java.util.Scanner;

public class Assignment4 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int phonePrice=1800,number_of_installment,installment_per_month;
        
        System.out.print("Enter number of installment : ");
        
        number_of_installment = input.nextInt();
        installment_per_month = phonePrice/number_of_installment;
        
        System.out.println("Monthly Installment : "+installment_per_month + " euro ");
        
        
    }
    
}
