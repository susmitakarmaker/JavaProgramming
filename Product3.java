
package begineerjava;

import java.util.Scanner;

public class Product3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int id,price;
        Scanner input1 = new Scanner(System.in);
        String title,description,category;
        
        System.out.print("ID : ");
        id = input.nextInt();
        System.out.print("Title : ");
        title = input1.nextLine();
        System.out.print("Price : ");
        price = input.nextInt();
        System.out.print("Description : ");
        description = input1.nextLine();
        System.out.print("Category : ");
        category = input1.nextLine();
        
        System.out.println("ID : "+id);
        System.out.println("Title : "+title);
        System.out.println("Price : "+price);
        System.out.println("Description : "+description);
        System.out.println("Category : "+category);
     
        
    }
 
}
