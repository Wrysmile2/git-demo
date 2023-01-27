
public class StringToBasic{
	public static void main(String[] args) {
		//基本数据类型转换->String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1+" "+s2+" "+s3+" "+s4);

		//String->对应基本数据类型转换
		String s5 = "123";
		int str1 = Integer.parseInt(s5);
		double str2 = Double.parseDouble(s5);
		float str3 = Float.parseFloat(s5);
		long str4 = Long.parseLong(s5);
		byte str5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short str6 = Short.parseShort(s5);
		System.out.println("==================");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(b);
		System.out.println(str6);

		//怎样把字符串转成字符char -> 含义是把字符串的第一个字符得到
		System.out.println(s5.charAt(0));
	}
}