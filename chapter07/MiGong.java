
public class MiGong{
	public static void main(String[] args) {
		//思路
		//1.先创建迷宫，用二维数组表示，int[][] map = new int[8][7];
		//2.规定map数组的元素值：0表示可以走1表示障碍物
		
		int[][] map = new int[8][7];
		//3.将最上面的一行和最下面的一行，全部设置为1
		for (int i=0;i<7;i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.将最左面的一行和最右面的一行，全部设置为1
		for (int i=0;i<8;i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		//输出当前地图
		System.out.println("====当前迷宫情况====");
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map[i].length;j++ ) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

		//使用findway
		T t1 = new T();
		t1.findway(map,1,1);
		System.out.println("\n=====找路的情况如下====");
 
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map[i].length;j++ ) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}

class T{
	//1.findway方法就是专门爱找出迷宫的路径
	//2.如果找到，就返回true，否则返回false
	//3.map就是二维数组，即表示迷宫
	//4.i,j就是老鼠的位置，初始化的位置是（1,1）
	//5.因为我们是递归的找路，所以先规定map数组的各个值的含义
	//  0表示可以走 1 表示障碍物 2 表示可以走 3 表示走过但走不通是死路
	//6.当map[6][5] = 2就说明找到通路，就可以结束，否则继续找
	//7.先确定老鼠找路策略 下->右->上->左
	public boolean findway(int[][] map,int i,int j){
		if (map[6][5] == 2) { //说明已经找到
			return true;
		}else{
			if (map[i][j] == 0) { 
				//假定可以走
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否可以走通
				//下->右->上->左
				if (findway(map,i+1,j)) {  //下
					return true;
				}else if (findway(map,i,j+1)) {  //右
					return true;
				}else if (findway(map,i-1,j)) {  //上
					return true;
				}else if (findway(map,i,j-1)) {  //左
					return true;
				}else{
					map[i][j] = 3;
					return false;
				}
				
			}else{
				return false;
			}
		}
	} 
}