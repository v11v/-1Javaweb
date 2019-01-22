package entity;

public class Student {

	private int id;
	private int age;
	private String sno;
	private String name;
	private String sex;
	
	public Student(int id,String sno,String name,String sex,int age) {
		super();
		this.id=id;
		this.age=age;
		this.name=name;
		this.sex=sex;
		this.sno=sno;
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

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
