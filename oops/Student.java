package oops;

public class Student extends Department {
		public void studentName() {
			System.out.println("Praveen M");
		}
		public void studentDept() {
			System.out.println("ECE");
		}
		public void studentId() {
			System.out.println("18ECR100");
		}
		public static void main(String[] args) {
			Student student =new Student();
			student.collegeCode();
			student.collegeName();
			student.collegeRank();
			student.departmentName();
			student.studentName();
			student.studentDept();
			student.studentId();
		}

	}

