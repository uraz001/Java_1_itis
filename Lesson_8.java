/**
* @author Shamil K
* 
* Двумерные массивы.
* Matrix17
* Matrix20
* Matrix27
* Matrix41
* Matrix47
*
*
*
*
*/

public class Lesson_8 {


	public static int [][] random2DArray(int m, int n){
		int [][] array = new int [m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}
		return array;
	}
	
	public static String toString(int [][] matr) {
		String result = "";
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				result += String.format("%4d", matr[i][j]);
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String [] args) {
		System.out.println(toString(random2DArray(5, 5)));
	}
	
	
}