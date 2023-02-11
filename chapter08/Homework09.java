
public class Homework09{
	public static void main(String[] args) {
		
	}
}
class Employee{
	//姓名，性别，年龄，职位，薪水
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//因为要求可以复用构造器，因此先写属性少的构造器
	//职位，薪水
	public Employee(String job,double sal){
		this.job = job;
		this.sal = sal;
	}
	//名字，性别，年龄
	public Employee(String name,char gender,int age){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Employee(String job,double sal,String name,char gender,int age){
		this(name,gender,age);
		this.job = job;
		this.sal = sal;
	}

}