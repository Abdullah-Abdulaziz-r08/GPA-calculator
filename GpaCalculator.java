
import java.util.Scanner;

public class GpaCalculator {

	public static void main(String[] args) {
		
		
		// here I used (scanner) to allow the user to put an input
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		
	
		System.out.println("plase inter the grade(A,B,C,D) of the first corse :");
		String gc1 = scan.next();
		
		System.out.println("plase inter the credit number of the first corse :");
		float cr1 =scan.nextInt();
		
		System.out.println("plase inter the grade(A,B,C,D) of the second corse :");
		String gc2 = scan.next();	
		
		System.out.println("plase inter the credit number of the second corse :");
		float cr2 =scan.nextInt();
		
		System.out.println("plase inter the grade(A,B,C,D) of the third corse :");
		String gc3 = scan.next();
		
		System.out.println("plase inter the credit number of the third corse :");
		float cr3 =scan.nextInt();
		
		System.out.println("plase inter the grade(A,B,C,D) of the forth corse :");
		String gc4 = scan.next();
		
		System.out.println("plase inter the credit number of the forth corse :");
		float cr4 =scan.nextInt();
		
		
		scan.close();

		float gradeValue1 = 0;
		
		if (gc1.equalsIgnoreCase("A")) {
			gradeValue1 = cr1*4;	
		}
		
		
		if (gc1.equalsIgnoreCase("B")) {
			gradeValue1 = cr1*3;
		}

		if (gc1.equalsIgnoreCase("C")) {
			gradeValue1 = cr1*2;
		}
		
		
		if (gc1.equalsIgnoreCase("D")) {
			gradeValue1 = cr1*1;
		}
		
		
float gradeValue2 = 0;
		
		if (gc2.equalsIgnoreCase("A")) {
			gradeValue2 = cr2*4;	
		}
		
		if (gc2.equalsIgnoreCase("B")) {
			gradeValue2 = cr2*3;
		}

		if (gc2.equalsIgnoreCase("C")) {
			gradeValue2 = cr2*2;
		}
		
		
		if (gc2.equalsIgnoreCase("D")) {
			gradeValue2 = cr2*1;
		}
		
		
float gradeValue3 = 0;
		
		if (gc3.equalsIgnoreCase("A")) {
			gradeValue3 = cr3*4;	
		}
		
		if (gc3.equalsIgnoreCase("B")) {
			gradeValue3 = cr3*3;
		}

		if (gc3.equalsIgnoreCase("C")) {
			gradeValue3 = cr3*2;
		}
		
		
		if (gc3.equalsIgnoreCase("D")) {
			gradeValue3 = cr3*1;
		}
		
		
float gradeValue4 = 0;
		
		if (gc4.equalsIgnoreCase("A")) {
			gradeValue4 = cr4*4;	
		}
		
		if (gc4.equalsIgnoreCase("B")) {
			gradeValue4 = cr4*3;
		}

		if (gc4.equalsIgnoreCase("C")) {
			gradeValue4 = cr4*2;
		}
		
		
		if (gc4.equalsIgnoreCase("D")) {
			gradeValue4 = cr4*1;
		}
		
		float totalCR = cr1 + cr2 + cr3 + cr4 ;
	
		float totalGR = gradeValue1 + gradeValue2 + gradeValue3 + gradeValue4 ;
		
		
		System.out.println("the GPA is:  " + (totalGR)/(totalCR) + "  out of 4");
			
		
	
		
		
}}
