import java.util.*;

public class B {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);

        int max = Integer.MIN_VALUE;
        int ansIndex = 0;

        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] % i == 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                ansIndex = i;
            }
        }
        System.out.println(ansIndex);

//        for (int i = 0; i < n-1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int gcp = gcp(a[i], a[j]);
//                if (gcp > max) {
//                    max = gcp;
//                    ans = a[i];
//                }
//            }
//        }
//
//        System.out.println(ans);
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