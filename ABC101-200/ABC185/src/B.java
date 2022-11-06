import java.util.*;

public class B {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();
        int m = sc.nextInt();
        long t = sc.nextLong();
        int[] a = new int[m];
        int[] b = new int[m];

        boolean answer = true;
        long max = n;

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long now = n;
        long out = 0;
        boolean result = true;

        for (int i = 0; i < m; i++) {
            now -= a[i] - out;
            if (now <= 0) {
                result = false;
                break;
            }
            now += b[i] - a[i];
            now = Math.min(now, n);
            out = b[i];
        }

        now -= t - out;
        if (now <= 0) {
            result = false;
        }

        System.out.println((result) ? "Yes" : "No");




        n -= Math.floor(a[0]);
        if (isMinus(n)) {
            System.out.println("No");
            return;
        }

//        n = Math.min(max, n + b[0] - a[0]);
//
//        for (int i = 1; i < m; i++) {
//            long walkTime = a[i] - b[i-1];
//            n -= Math.floor(walkTime);
//            if (isMinus(n)) {
//                System.out.println("No");
//                return;
//            }
//
//            long restTime = b[i] - a[i];
//            n = Math.min(max, n + restTime);
//        }
//
//        long lastTime = t - b[m-1];
//        n -= Math.floor(lastTime);
//        if (isMinus(n)) {
//            System.out.println("No");
//            return;
//        }
//
//        System.out.println("Yes");
    }
    
    static boolean isMinus(long n) {
        return n < 0;
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