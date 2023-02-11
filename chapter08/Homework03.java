
public class Homework03{
	public static void main(String[] args) {
		Book b1 = new Book("三体",200);
		b1.info();
		b1.updatePrice();
		b1.info();
	}
}
class Book{
	String name;
	double price;
	public Book(String name,double price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		//如果方法中，没有price局部变量，this.price等价price
		if (price>150) {
			price = 150;
		}else if (this.price>100) {
			this.price = 100;
		}else{

		}
	}
	//显示书籍情况
	public void info(){
		System.out.println("书名："+this.name+" 价格="+this.price);
	}

}