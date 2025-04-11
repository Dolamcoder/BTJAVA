package btoop4;

public class bt2 {

	public static void main(String[] args) {
		        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 15000.00);
		        System.out.println("STUDENT:");
		        System.out.println("Name: " + student.getName());
		        System.out.println("Address: " + student.getAddress());
		        System.out.println("Program: " + student.getProgram());
		        System.out.println("Year: " + student.getYear());
		        System.out.println("Fee: " + student.getFee());
		        student.setProgram("Software Engineering");
		        student.setYear(3);
		        student.setFee(16000.00);
		        System.out.println("Updated Student: " + student);
		    }
	}
