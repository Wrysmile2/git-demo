
public class MethodsExercise03{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "java";
		p.age = 100;
		MyTools tool = new MyTools();
		Person p2 = tool.copyPerson(p);

		System.out.println("p的属性 age="+p.age+" 名字="+p.name);
		System.out.println("p2的属性 age="+p2.age+" 名字="+p2.name);
	
		System.out.println(p==p2);
	}
}
class Person{
	String name;
	int age;

}
class MyTools{
	//编写一个方法，可以复制Person对象
	public Person copyPerson(Person p){
		//创建一个新的对象
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}
