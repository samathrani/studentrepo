package student;

public class StudentGrade {

	int studentId;
	String studentName;
	float subject1;
	float subject2;
	float subject3;
	float subject4;
	float sum;
	float average;
	String grade;
	static int numOfOutstandingStudent;
	static int numOfFirstclassStudent;
	static int numOfSecondclassStudent;
	static int numOfStudents;
	//static int numOfStudentAbv300;
	//static int numOfStudentBlw300;

//	
	public StudentGrade(float Maths, float Physics, float Chemistry, float Biology) {
		this.subject1 = Maths;
		this.subject2 = Physics;
		this.subject3 = Chemistry;
		this.subject4 = Biology;
	}

	public float calculateSum() {
		this.sum = (subject1 + subject2 + subject3 + subject4);

		
		return sum;
	}

	public float calculateAverage() {
		this.sum = calculateSum();
		this.average = this.sum / 4;
		return average;

	}

	public String calculateGrade() {
		this.average = calculateAverage();
//		if (this.sum > 300) {
//			numOfStudentAbv300++;
//		}
//
//		else {
//			numOfStudentBlw300++;
//		}

		if (this.average >= 85) {

			numOfOutstandingStudent++;

			return grade = "outstanding";

		} else if (this.average >= 60) {
			numOfFirstclassStudent++;
			return grade = "firstclass";
		} else {
			numOfSecondclassStudent++;
			return grade = "secondgrade";
		}
	}
	public static void main(String[] args) {

		StudentGrade[] stud = new StudentGrade[10];

		stud[0] = new StudentGrade(99, 98, 97, 90);
		stud[1] = new StudentGrade(89, 70, 55, 68);
		stud[2] = new StudentGrade(78, 76, 45, 56);
		stud[3] = new StudentGrade(98, 96, 95, 96);
		stud[4] = new StudentGrade(89, 68, 87, 80);
		stud[5] = new StudentGrade(49, 40, 55, 68);
		stud[6] = new StudentGrade(78, 76, 45, 56);
		stud[7] = new StudentGrade(99, 98, 97, 90);
		stud[8] = new StudentGrade(59, 70, 55, 68);
		stud[9] = new StudentGrade(68, 46, 45, 36);

		for (int i = 0; i < 10; i++) {

			System.out.println("Student No." + (i + 1));
			System.out.println("Sum is  " + stud[i].calculateSum());
			System.out.println("Average is  " + stud[i].calculateAverage());
			System.out.println("Grade is " + stud[i].calculateGrade());
			System.out.println("No.Of Outstanding Students=" + numOfOutstandingStudent);
			System.out.println("No. Of Firstclass Students =" + numOfFirstclassStudent);
			System.out.println("No. Of SecondClass Students =" + numOfSecondclassStudent);
			//System.out.println("Abv300=" + numOfStudentAbv300);
			//System.out.println("Blw300=" + numOfStudentBlw300);
		}
	
}}
