
public class AutoConvertDetail{
	public static void main(String[] args) {
		//有多种类型的数据混合运算时
		//系统首先自动将所有数据转换成容量最大的数据类型，然后在进行计算
		int n1 = 10;
		double d1 = n1 + 1.1;//错误，结果是double类型
		float d2 = n1 + 1.1F;
		System.out.println(d1 + "\n" + d2);

		//当我们把精度(容量)大的数据类型赋值给精度小的数据类型时，
		//就会报错，反之就会进行自动类型转换；
		// int n2 = 1.1; //会报错 double -> int 
		
		//byte,short,char 之间不会自动转换
		//当把数值byte时，先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10; //对，-128~127
		int n2 = 1;
		byte b2 = n2;//?
	}
}