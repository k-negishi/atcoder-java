import java.util.Arrays;
import java.util.Scanner;

public class D3 {
    final static int MOD = 1000000007;
    
    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        int n = in.nextInt();
        int[] l = in.nextIntArray(n);
        int target = in.nextInt();
        Arrays.sort(l);
        
        int lower = 0;
        int upper = n - 1;
        int middle = 0;
        
        while (upper - lower > 1) {
            System.out.println("lower: " + lower);
            System.out.println("upper: " + upper);
            middle = (upper + lower) / 2;
            System.out.println("middle:" + middle);
            System.out.println("l[middle]" + l[middle]);
            if (l[middle] == target) {
                System.out.println(middle);
                break;
            } else if (l[middle] < target) {
                lower = middle;
                System.out.println("lower: " + lower);
                
            } else {
                upper = middle;
                System.out.println("upper: " + upper);
            }
            System.out.println();
        }
        System.out.println(middle);
        
        
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