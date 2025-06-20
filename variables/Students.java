class Students{
	static String collegeName = "Karunakar University";
	int rollNo;
	String studentName;
	Students(int id, String name){
		rollNo = id;
		studentName = name;
		System.out.println("Student name is :" + studentName + "Student Roll No : " + rollNo + "and college name is : " + collegeName);

	}

	public void displayInfo(int age){
		System.out.println("Student name is :" + studentName + "Student Roll No : " + rollNo + "and college name is : " + collegeName + age);
	}

	public static void main(String [] args){
		Students s1 = new Students(10, "Tanuja");
	        Students s2 = new Students(11, "Neelima");
		Students s3 = new Students(12, "Vijetha");
		
		int age = 30;
		
		Students.collegeName = "Abhinai university";
		s1.displayInfo(age);
		s2.displayInfo();
		s3.displayInfo();


	}
}


