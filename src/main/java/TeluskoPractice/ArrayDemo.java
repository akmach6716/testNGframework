package TeluskoPractice;

class Student {
	int rollno;
	String name;
}

public class ArrayDemo {
	public static void main(String[] args) {
		Student s1= new Student();	
		Student s2= new Student();	
		Student s3= new Student();
		Student s4= new Student();
		Student s []= {s1,s2,s3,s4};
		int[] nums = new int[4];
		nums[0] = 23;
		nums[1] = 23;
		nums[2] = 33;
		nums[3] = 43;
		for (int i = 0, j = 0; i < nums.length; i++, j++) {
			System.out.println("Value at " + j + "th index  is " + nums[i]);
		}

	}

}
