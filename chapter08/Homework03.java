
public class Homework03{
	public static void main(String[] args) {
		Book b1 = new Book("����",200);
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
		//��������У�û��price�ֲ�������this.price�ȼ�price
		if (price>150) {
			price = 150;
		}else if (this.price>100) {
			this.price = 100;
		}else{

		}
	}
	//��ʾ�鼮���
	public void info(){
		System.out.println("������"+this.name+" �۸�="+this.price);
	}

}