
public class case02{
	public static void main(String[] args) {
		/*for (int i=1;i<=5;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}*/

		/*for (int i=1;i<=5 ;i++ ) {
			for (int k=1;k<=5-i ;k++ ) {
				System.out.print(" ");
			}
			for (int j=1;j<=2*i-1 ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		int totallevel = 10;
		for (int i=1;i<=totallevel ;i++ ) {
			for (int k=1;k<=totallevel-i ;k++ ) {
				System.out.print(" ");
			}
			for (int j=1;j<=2*i-1 ;j++ ) {
				if (j==1 || j==2*i-1 || i==totallevel) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}