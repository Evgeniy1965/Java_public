public class PascTr {

	/**
	 * author: Evgeniy
	 * Треугольник Паскаля до 12 уровня.
	 */
	
	private static void nullArray(int[][] source){
		
		for(int i=0;i<source.length;i++)
			for(int j=0;j<source[i].length;j++)
				source[i][j] = 0;
		
	}
	
	private static void printArray(int[][] source){
		
		String strD;
		for(int i=0;i<source.length;i++){
			strD = "";
			for(int j=0;j<source[i].length;j++)
				strD= strD+source[i][j]+"\t";
			System.out.println(strD);
		}
		
	}
	public static void main(String[] args) {

		int[][] arrayPasc = new int[12][23];
		int left,right;
		left = 10; right = 12; 
		nullArray(arrayPasc);
		
		arrayPasc[0][11] = 1;
		
		for(int i=1;i<arrayPasc.length;i++){
			for(int j=left;j<=right;j+=2){
				if((j==left)||(j==right))arrayPasc[i][j] = 1;
				else arrayPasc[i][j] = arrayPasc[i-1][j-1] +
						arrayPasc[i-1][j+1];				
			}
			if(left>=1)left--;
			if(right<=23)right++;
		}
		
		printArray(arrayPasc);

	}

}
