import java.util.*;

public class C {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];

        // 入力の受け取り
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[] rikaido = new int[m];
        int costTemp = 0;
        List<Integer> costSave = new ArrayList<>();
        boolean masterd = true;

        // 参考 https://qiita.com/aja_min/items/2a94758cf58fc1ea6f65
        // bit全探索
        for (int i = 0; i < 1 << n; i++) {
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j ) == 1) {
                    // j冊目の参考書を買ったときのm番目のアルゴリズムの理解度上昇
                    for (int k = 0; k < m; k++) {
                        rikaido[k] += a[j][k]

                    }

                }



            }

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