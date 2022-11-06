import java.util.*;

public class B {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();


        Map<Integer, Set<Integer>> cityMap = new TreeMap<>();

        for (int i = 0; i < m; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();


            if (!cityMap.containsKey(a)) {
                Set<Integer> cityTreeSet = new TreeSet<>();
                cityTreeSet.add(b);
                cityMap.put(a, cityTreeSet);
            } else {
                Set<Integer> nowCitySet = cityMap.get(a);
                nowCitySet.add(b);
                cityMap.replace(a, nowCitySet);
            }

            if (!cityMap.containsKey(b)) {
                Set<Integer> cityTreeSet = new TreeSet<>();
                cityTreeSet.add(a);
                cityMap.put(b, cityTreeSet);
            } else {
                Set<Integer> nowCitySet = cityMap.get(b);
                nowCitySet.add(a);
                cityMap.replace(b, nowCitySet);
            }

        }

        Integer index = 1;
        for (Map.Entry<Integer, Set<Integer>> entry : cityMap.entrySet()) {
            Integer cityNum = entry.getKey();
            Set<Integer> set = entry.getValue();

            while(!index.equals(cityNum) && index < n) {
                System.out.println(0);
                index++;
            }

            int size = set.size();
            StringBuilder sb = new StringBuilder();
            sb.append(size);

            for (Integer integer : set) {
                sb.append(" ").append(integer);
            }
            System.out.println(sb.toString());
            index++;
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