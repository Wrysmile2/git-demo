
public class MethodsExercise03{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "java";
		p.age = 100;
		MyTools tool = new MyTools();
		Person p2 = tool.copyPerson(p);

		System.out.println("p������ age="+p.age+" ����="+p.name);
		System.out.println("p2������ age="+p2.age+" ����="+p2.name);
	
		System.out.println(p==p2);
	}
}
class Person{
	String name;
	int age;

}
class MyTools{
	//��дһ�����������Ը���Person����
	public Person copyPerson(Person p){
		//����һ���µĶ���
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}
