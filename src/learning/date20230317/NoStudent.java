package learning.date20230317;

public class NoStudent {
    private String no;
	private String name;
	private int age;
	private String address;
	
	public NoStudent() {super();}
	
	public NoStudent(String no,String name,int age,String address) {
		this.no=no;
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
