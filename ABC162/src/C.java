import java.util.*;

public class C {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int k = sc.nextInt();
        long sum = 0;

        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    sum += gcd(gcd(a,b),c);
                }
            }
        }

//        // a,b,cがすべて同じ場合
//        sum += k * (k + 1) / 2;
//
//        // a,b,cのうち2つが同じ場合
//        for (int ab = 1; ab <= k ; ab++) {
//            for (int c = ab + 1; c <= k; c++) {
//                sum+= (gcd(ab, c)) * 6;
//            }
//
//        }

//        // a,b,cが相異なる場合
//        for (int a = 1; a <= k; a++) {
//            for (int b = a + 1; b <= k; b++) {
//                for (int c = b + 1; c <= k; c++) {
//                    sum += gcd(gcd(a,b),gcd(b,c));
//                }
//            }
//        }
        System.out.println(sum);



    }

    static int gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (int) b;
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