import java.util.*;

public class E {
	final static int MOD = 1000000007;
	
	public static void main(String[] args) {
		MyScanner in = new MyScanner();
		int n = in.nextInt();
		int[] p = new int[n];
		int[] temp = new int[n];
		
		for (int i = 0; i < n; i++) {
			p[i] = in.nextInt();
			temp[i] = p[i];
		}
		
		int sum = 0;
		Arrays.sort(temp);
		int max = temp[temp.length-2];
		
		for (int i = 0; i < p.length-1; i++) {
			for (int j = i+1; j < p.length; j++) {
				int second = Second(p, i, j);
				
				if (second==max) {
					sum += second * (p.length -j);
					break;
				} else {
					sum += second;
				}
				
			}
		}
		System.out.println(sum);
		
	}
	
	static int Second(int[] n, int a, int b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = a; i <= b; i++) {
			list.add(n[i]);
		}
		Collections.sort(list);
		return list.get(list.size()-2);
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