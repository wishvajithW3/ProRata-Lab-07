import java.util.Scanner;
 public class IT23267640Lab7Q3{
  public static void main (String [] args){
  
  Scanner input = new Scanner(System.in);
  
  for (int customer = 1; customer <= 5; customer++){
   System.out.println("\nCustomer " +customer);
   
   System.out.print("Enter total bill amount: ");
   double totalBill = input.nextDouble();
   
   System.out.print("Enter mode of payment (C for cash, O for other):");
   char mode = input.next().charAt(0);
   
   if (mode == 'C' || mode == 'c'){
     double discount = totalBill * 0.05;
	 double amountTobepaid = totalBill - discount;
	 
	 System.out.println("Discount is : " + discount);
	 System.out.println("Amount to be paid: " + amountTobepaid);

   }
   
   else if (mode == 'O' || mode == 'o'){
     System.out.println("No discount applicable");
	 System.out.println("Amount to be paid: " + totalBill);
	 
    }
	
   else {
      System.out.println("Payment Mode is Not Valid");
	  
   }
   
  }
  
 }
  
 }