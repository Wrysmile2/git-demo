import java.util.Scanner;//表示把java.util下的Scanner类导入
public class Input{
	//编写一个main方法
	public static void main(String[] args) {
		//Scanner类 表示 简单文本扫描器，在java.util包
		//1.导入Scanner类所在的包
		//2.创建Scanner对象，new创建一个对象，
		Scanner myScanner = new Scanner(System.in);
		//3.接受用户的输入
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double wages = myScanner.nextDouble();
		System.out.println("人的信息如下");
		System.out.println("名字=" + name + 
			"年龄=" + age + "薪水=" + wages);
	}
}