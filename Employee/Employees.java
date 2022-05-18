package Employee;

public class Employees {
	private int id;
	private int age;
	private String name;
	private int marks;
	public Employees(int id, int age, String name, int marks) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
