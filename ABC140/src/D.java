import java.util.*;

public class D {
	final static int MOD = 1000000007;
	
	public static void main(String[] args) {
		MyScanner in = new MyScanner();
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		
		char[] c = s.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < k; i++) {
			
			
			sum = Happy(c);
			if (sum == n) {
				break;
			}
		}
		
		System.out.println(sum);
		
	}
	
	static int Happy(char[] c) {
		int sum = 0;
		for (int i = 1; i < c.length; i++) {
			if (c[i]==c[i-1]) {
				sum++;
			}
		}
		return sum;
	}
	
	static char[] Change(char[] c,int a, int b) {
		for (int i = a; i <= b; i++) {
			if (c[i]=='L') {
				c[i] = 'R';
			} else {
				c[i] = 'L';
			}
		}
		return c;
	}
	
	static class MyScanner {
		static Scanner sc = new Scanner(System.in);
		
		String next() {
			return sc.next();
		}
		
		String nextLine() {
			return sc.nextLine();
		}
		
		int nextInt() {
			return Integer.parseInt(sc.next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextInt();
			}
			return array;
		}
		
		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextDouble();
			}
			return array;
		}
		
		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}
			return array;
		}
		
		String[] nextLineArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLine();
			}
			return array;
		}
		
		int[][] nextIntMatrix(int n, int m) {
			int[][] matrix = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = nextInt();
				}
			}
			return matrix;
		}
		
		double[][] nextDoubleMatrix(int n, int m) {
			double[][] matrix = new double[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = nextDouble();
				}
			}
			return matrix;
		}
		
		long[][] nextLongMatrix(int n, int m) {
			long[][] matrix = new long[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = nextLong();
				}
			}
			return matrix;
		}
	}
}