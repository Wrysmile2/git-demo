
public class ConstructorExercise{
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("p1的信息: name="+p1.name+" age="+p1.age);
		Person p2 = new Person("scott",50);
		System.out.println("p2的信息: name="+p2.name+" age="+p1.age);
	}
}
class Person{
	String name;//默认值 null
	int age;//默认值 0;
	//第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
	public Person(){
		age = 35;
	}
	//第二个带pName pAge
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
}