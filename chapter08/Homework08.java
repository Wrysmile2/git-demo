
public class Homework08{ //公有类
	int count = 9;//属性
	public void count1(){//Homework08类的成员方法
		count = 10;
		System.out.println("count1="+count);
	}
	public void count2(){//Homework08类的成员方法
		System.out.println("count2="+count++);
	}
	//这是Homework08类的main方法，任何一个类，都可以main
	public static void main(String[] args) {
		//1.new Homework08() 是匿名对象 
		new Homework08().count1();
		Homework08 h1 = new Homework08();
		h1.count2();
		h1.count2();
	}
}