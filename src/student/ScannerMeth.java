package student;

import java.util.Iterator;
import java.util.Scanner;

public class ScannerMeth {
	int studentId;
	float sub1;
	float sub2;
	float sub3;
	float sub4;
	float sum;
	float average;
	String grade;

   static int numOfStudents; 
	static int numOfOutstanding;
	static int numOfFirstClass;
	static int numOfSecondClass;

	public ScannerMeth(float maths, float physics, float chemistry, float biology) {
		this.sub1 = maths;
		this.sub2 = physics;
		this.sub3 = chemistry;
		this.sub4 = biology;
	}

	public float calculateSum() {
		this.sum = (sub1 + sub2 + sub3 + sub4);
		return sum;
	}

	public float calculateAverage() {
		this.average = this.sum / 4;
		return average;
	}

	public String calculateGrade() {
		if (calculateAverage() >= 85) {
			numOfOutstanding++;
			return grade = "outstanding";
		} else if (calculateAverage() >= 70) {
			numOfFirstClass++;
			return grade = "firstClass";

		} else {
			numOfSecondClass++;
			return grade = "secondClass";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("NumOfStudents");
		  int numOfStudents=sc.nextInt();
		
		for (int i = 1; i <= numOfStudents ; i++) {
			
		System.out.println("Enter ");
			
		System.out.println("Maths Mark");
		float maths=sc.nextFloat();
		
		System.out.println("Physics Mark");
		float physics=sc.nextFloat();
		
		System.out.println("Chemistry Mark");
		float chemistry=sc.nextFloat();
		
		System.out.println("Biology Mark");
		float biology=sc.nextFloat();
		
		ScannerMeth stud =new ScannerMeth(maths,physics,chemistry,biology);
		

		
		System.out.println("sum =" + stud.calculateSum());
		System.out.println("Average ="+ stud.calculateAverage());
		System.out.println("Grade="+stud.calculateGrade());
		System.out.println("No.Of Outstanding Students=" +numOfOutstanding);
		System.out.println("No. Of Firstclass Students =" +numOfFirstClass );
		System.out.println("No. Of SecondClass Students =" + numOfSecondClass);
		}
	}
}
