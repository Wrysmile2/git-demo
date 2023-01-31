
public class Homework01{
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;
		while(money>=1000)
		{
			if (money>50000) {
				money *= 0.95;
				count++;
			}
			else
			{
				money -= 1000;
				count++;
			}
		}
		System.out.println(money + "过了" + count + "个路口");

	}
}