import java.math.BigInteger;
import java.util.*;

public class C {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();

        long absX = Math.abs(x);
        long answer;

        // d * k がオーバーフローする可能性があるので、式変形する
        if (absX / d > k) {
            answer = absX - (d * k);
        } else {
            // 往復に入るまでの回数
            long shou = absX / d;
            // 回数が商の分減る
            long nokori = k - shou;
            // 座標を往復に入るまで近づける
            long tempZahyou = absX - shou * d;

            if (nokori % 2 == 1) {
                answer = Math.abs(tempZahyou - d);
            } else {
                answer = tempZahyou;
            }
        }

        System.out.println(answer);

//        以下、残骸
//        if (x > k * d) {
//            long amari = Math.abs(x - (k * d));
//            System.out.println(amari);
//        } else {
//            long shou = Math.abs(x / d);
//            long amari = x % d;
//
//            if (shou % 2 == 0 && (k-1) % 2 == 0) {
//                System.out.println(Math.abs(amari));
//            } else{
//                long answer = Math.abs(amari + d) < Math.abs(amari - d) ? Math.abs(amari + d) : Math.abs(amari - d);
//                System.out.println(answer);
//            }
//
//        }
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