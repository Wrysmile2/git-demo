
public class Constructor01{
	public static void main(String[] args) {
		Person p1 = new Person("smith",35);
		System.out.println("p1的信息如下:");
		System.out.println("p1的对象name="+p1.name);
		System.out.println("p1的对象age="+p1.age);
	}
}

class Person{
	String name;
	int age;
	//构造器
	//1.构造器没有返回值，也不能写void
	//2.构造器的名称和类名要一样
	public Person(String pName,int pAge){
		System.out.println("构造器被调用");
		name = pName;
		age = pAge;
	}
}