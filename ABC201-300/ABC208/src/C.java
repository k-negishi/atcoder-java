import java.util.*;

public class C {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        long k = sc.nextLong();
        // Key...国民番号, Value...インデックス
        Map<Integer, Integer> aMap = new TreeMap<>();
        long[] kosuu = new long[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            aMap.put(a, i);
        }

        long base = k / n;
        Arrays.fill(kosuu, base);

        long amari = k % n;
        int amariCount = 0;

        Object[] numAry = aMap.values().toArray();
        for (int i = 0; i < amari; i++) {
            kosuu[(int) numAry[i]]++;
        }
//        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
//            if (amariCount < amari) {
//                kosuu[entry.getValue()]++;
//                amariCount++;
//            }
//        }

        for (long ans : kosuu ) {
            System.out.println(ans);
        }

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