
public class Constructor01{
	public static void main(String[] args) {
		Person p1 = new Person("smith",35);
		System.out.println("p1����Ϣ����:");
		System.out.println("p1�Ķ���name="+p1.name);
		System.out.println("p1�Ķ���age="+p1.age);
	}
}

class Person{
	String name;
	int age;
	//������
	//1.������û�з���ֵ��Ҳ����дvoid
	//2.�����������ƺ�����Ҫһ��
	public Person(String pName,int pAge){
		System.out.println("������������");
		name = pName;
		age = pAge;
	}
}