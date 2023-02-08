
public class ConstructorDetail{
	public static void main(String[] args) {
		Person p1 = new Person("king",35);
		Person p2 = new Person("tom");
	}
}
class Person{
	String name;
	int age;
	//第一个构造器
	public Person(String pName,int pAge){
		System.out.println("构造器被调用");
		name = pName;
		age = pAge;
	}
	//第二个构造器，只指定人名，不需要指定年龄
	public Person(String pName){
		name = pName;
	}
}