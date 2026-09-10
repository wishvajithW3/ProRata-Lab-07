import java.util.Scanner;
 public class IT23267640Lab7Q1B{
  public static void main (String [] args){
  
  Scanner input = new Scanner(System.in);
  
  for (int student = 1; student <= 3; student++){
   System.out.println("Student " +student);
   System.out.print("Enter marks: ");
   
   int total = 0;
   
   for (int i = 0; i < 4; i++){
     total += input.nextInt();
   }
   
   double average = (double)total / 4;
   
   String grade;
   if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
  
  System.out.print("average is : " +average);
  System.out.print("\nOverall Grade is :" +grade);
  System.out.println("\n");
  
 }
 
}

}