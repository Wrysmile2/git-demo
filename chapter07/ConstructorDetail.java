
public class ConstructorDetail{
	public static void main(String[] args) {
		Person p1 = new Person("king",35);
		Person p2 = new Person("tom");
	}
}
class Person{
	String name;
	int age;
	//��һ��������
	public Person(String pName,int pAge){
		System.out.println("������������");
		name = pName;
		age = pAge;
	}
	//�ڶ�����������ָֻ������������Ҫָ������
	public Person(String pName){
		name = pName;
	}
}