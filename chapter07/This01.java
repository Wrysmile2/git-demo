
public class This01{
	public static void main(String[] args) {
		Dog dog1 = new Dog("´ó×³",3);
		System.out.println("dog1µÄhashcode=" + dog1.hashCode());
		//dog1.info();
		//Dog dog2 = new Dog("´ó»Æ",2);
		//dog2.info();
	}
}
class Dog{
	String name;
	int age;
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("this.hashCode="+this.hashCode());
	}
}