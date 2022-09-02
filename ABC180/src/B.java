import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;

public class B {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        long[] x = sc.nextLongArray(n);

        long manhattan = 0;
        long yukuridSqrt = 0;
//        BigDecimal yukuridSqrt = new BigDecimal(0);
        long chebishef = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            manhattan += Math.abs(x[i]);
//            yukuridSqrt.add(BigDecimal.valueOf(Math.abs(x[i]) * Math.abs(x[i])));
            yukuridSqrt += Math.abs(x[i]) * Math.abs(x[i]);
            chebishef = Math.max(chebishef, Math.abs(x[i]));
        }

        BigDecimal bigDecimal = new BigDecimal(Long.toString(yukuridSqrt));
        BigDecimal yukurid = bigDecimal.sqrt(MathContext.DECIMAL128);

//        BigInteger bigInteger = new BigInteger(Long.toString(yukuridSqrt));
//        BigInteger yukurid = bigInteger.sqrt();

//        double yukurid = Math.sqrt((double)yukuridSqrt);

        System.out.println(manhattan);
        System.out.println(yukurid);
        System.out.println(chebishef);
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