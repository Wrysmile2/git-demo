
public class Homework09{
	public static void main(String[] args) {
		
	}
}
class Employee{
	//�������Ա����䣬ְλ��нˮ
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//��ΪҪ����Ը��ù������������д�����ٵĹ�����
	//ְλ��нˮ
	public Employee(String job,double sal){
		this.job = job;
		this.sal = sal;
	}
	//���֣��Ա�����
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