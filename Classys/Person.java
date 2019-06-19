package Classys;

public class Person {
	
	private int age;
	private String name;
	private String job_Title;
	
	public Person(String name, int age, String job_Title) {
		super();
		this.name = name;
		this.age = age;
		this.job_Title = job_Title;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String getjob_Title() {
		return job_Title;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", job_Title=" + job_Title + "]";
	}
	
}
