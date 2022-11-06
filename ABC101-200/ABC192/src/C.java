import java.lang.reflect.Array;
import java.util.*;

public class C {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        long n = sc.nextLong();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            char[] g2Str = Long.toString(n).toCharArray();
            Arrays.sort(g2Str);

            long g1 = Long.parseLong(new StringBuffer(new String(g2Str)).reverse().toString());
            long g2 = Long.parseLong(new String(g2Str));
            n = g1 - g2;
        }

        System.out.println(n);


//        String a = n;
//        int index = 1;
//        while (index <= k) {
//            long calc = g1(a.toCharArray()) - g2(a.toCharArray());
//            a = Long.toString(calc);
//            index++;
//        }
//        System.out.println(a);
//
//    }
//    public static long g1(char[] c) {
//        String s = Long.toString(g2(c));
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return Long.parseLong(sb.toString());
//    }
//
//    public static long g2(char[] c) {
//        Arrays.sort(c);
//        String s = new String(c);
//        return Long.parseLong(s);
//    }
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