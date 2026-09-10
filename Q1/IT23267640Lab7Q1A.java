import java.util.Scanner;
public class IT23267640Lab7Q1A{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		int mark_1,mark_2,mark_3,mark_4;
		double average;
		
		System.out.println("Enter marks for four subjects");
		
		System.out.print("Enter marks for subject 1:");
		mark_1= input.nextInt();
		
		System.out.print("Enter marks for subject 2:");
		mark_2= input.nextInt();
		
		System.out.print("Enter marks for subject 3:");
		mark_3= input.nextInt();
		
		System.out.print("Enter marks for subject 4:");
		mark_4= input.nextInt();
		
		
		average=(mark_1+mark_2+mark_3+mark_4)/4;
		System.out.println("Average marks:"+average);
		
		if(average<=100){
			System.out.print("Overal Grade is Distinction");
		}
		else if(average<=75){
			System.out.print("Overal Grade is Credit");
		}
		else if(average<50){
			System.out.print("Overal Grade is Fail");
		}
		
		
		
	}
}