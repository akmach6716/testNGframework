package TeluskoPractice;

public class twoDarrayDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[][] = { { 56, 2, 3, 4 }, { 2, 4, 6, 8 }, { 3, 6, 9, 12 } };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
	}

}
