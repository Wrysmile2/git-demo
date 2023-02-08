
public class Varscope01{
	public static void main(String[] args) {
		T t1 = new T();
		Cat c1 = new Cat();
		t1.test();
		t1.test2(c1);
	}
}
class T{
	public void test(){
		Cat p1 = new Cat();
		System.out.println(p1.name);
	}
	public void test2(Person p){
		System.out.println(p.name);
	}
}
class Cat{

	int age = 10;
	String name = "jack";

	double num;
	public void cry(){

		int n=10;
		String name = "jack";
	}
}