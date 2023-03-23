// Mariveles Mental Wellness and General Hospital System
// Created by : Christiane A. Bacani
import java.util.Scanner;
public class MarivelesMentalHospitalSystem {
    
    public static void  psychiatric(){
    System.out.print("\nTHE PSYCHIATRIC DOCTOR IS ON THE WAY TO YOUR FOLLOW-UP CHECK UP1");
    
    }
    public static void  physician(){
        System.out.print("\nTHE DOCTOR IS ON THE WAY TO YOUR FOLLOW-UP CHECK UP!");
    }
    
    public static void meds(){
       Scanner input = new Scanner(System.in);
       System.out.print("PLEASE CHOOSE :\n");
       
       System.out.print("1.) Ferou Sulfate\n2.) Magnesium Chloride\n3.) Potassium Chloride\n4.) Exit\n");
       String choose = input.nextLine();
       
       if(choose.equals("1")){
            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            double price = 3.75;
            System.out.print("The total price is : P " + (price * quantity));
            
            System.out.print("\n\nNOTE! THIS IS  TOTALLY FREE IN OUR HOSPITAL!!!");
         
       }
       else if(choose.equals("2")){
           System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            double price = 4.75;
            System.out.print("The total price is : P " + (price * quantity));
            
            System.out.print("\n\nNOTE! THIS IS  TOTALLY FREE IN OUR HOSPITAL!!!");
            
       }
       else if(choose.equals("3")){
           System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            double price = 5.75;
            System.out.print("The total price is : P " + (price * quantity));
            
            System.out.print("\n\nNOTE! THIS IS  TOTALLY FREE IN OUR HOSPITAL!!!");
            
       }
       else if(choose.equals("4")){
           System.out.print("THANK YOU FOR VISITING OUR APP!");
           
       }
       else{
           System.out.print("\nINVALID CHOICE!");
       }   
    }
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mariveles Mental Wellness and General Hospital\n");
        
        System.out.print("FILL UP A FORM BEFORE ENTERING!\n");
        
        System.out.print("Enter full name : ");
        String fullname = input.nextLine();
        
        System.out.print("Enter middle name : ");
        String middlename = input.nextLine();
        
        System.out.print("Enter surname : ");
        String surname = input.nextLine();
        
        System.out.print("Enter contact number : ");
        String number = input.nextLine();
        
        System.out.print(("Enter address : "));
        String address = input.nextLine();
        
        System.out.print("CHOOSE TRANSACTION :\n");
        
        System.out.print("1.) Psychiatric check-up\n2.) Physician chek-up\n3.) Buy a medicine\n4.) Exit\n");
        System.out.print("Enter choice : ");
        String  choice = input.nextLine();
        
        switch(choice){
            case  "1":
                psychiatric();
                break;
                
            case "2":
                physician();
                break;
                
            case "3":
                meds();
                break;
                
            case "4":
                System.out.print("\nINVALID CHOICE!");
                break;
                
            default:
                System.out.print("\nINVALID CHOICE!"); 
                
        }
         
    }
}
