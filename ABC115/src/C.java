import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < h.length - k + 1; i++) {
			int calc = h[i+k-1] - h[i];
			ans = Math.min(ans,calc);
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
