import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.KeyPair;
import java.util.*;

public class B {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long sx = sc.nextLong();
        long sy = sc.nextLong();
        long gx = sc.nextLong();
        long gy = sc.nextLong();

        long bigTakasa = sy + gy;
        long bigYoko = gx - sx >= 0 ? gx - sx : sx - gx;

        long bunshi = sy * bigYoko;
        long bunbo = bigTakasa;
        BigDecimal bigDecimalBunshi = new BigDecimal(bunshi);
        BigDecimal bigDecimalbunbo = new BigDecimal(bunbo);
        BigDecimal calc = bigDecimalBunshi.divide(bigDecimalbunbo, 10, RoundingMode.HALF_UP);

        if (sx < gx) {
            System.out.println(calc.add(BigDecimal.valueOf(sx)));
        } else {
            calc = calc.multiply(BigDecimal.valueOf(-1));
            System.out.println(calc.add(BigDecimal.valueOf(sx)));

        }


//        if ((sx + gx) / 2 < 0) {
//        }

//        double answer = (double)sy * (double)(bigYoko) / (double)bigTakasa + (double)sx;


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