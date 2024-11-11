package objectclass;





public class Student {
	
	String name;
	int a;
	
	Student(String name, int a) {
		this.name = name;
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "Student{name='" + name + "', a=" + a + "}";
	}
	public int hashCode() {
		return 123;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		Student student = (Student) obj;
		return this.name.equals(student.name)&& this.a==student.a;
		
	}
//	

	
	
	public static void main(String[] args) {
		Student s1 = new Student("John", 10);
		Student s2 = new Student("John", 10);
		Student s3 = new Student("Jane", 20);

		// Display the 'toString' output
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// Check reference equality and content equality
		System.out.println("s1 == s2: " + (s1 == s2));          // false (different references)
		System.out.println("s1.equals(s2): " + (s1==s2));   // true (content is equal)
		
			System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("s2.hashCode(): " + s2.hashCode());
		System.out.println("s3.hashCode(): " + s3.hashCode());

		
	}
}
