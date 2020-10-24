import java.util.*;
public class work{
    
    static int gcp(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (int) b;
    }
    
    static int lcm(long a, long b) {
        long c = a * b;
        return (int) c / lcm(a, b);
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] data = new int[N];
        
        int a = 0;
        int total=0;
        
        while(a<N){
            data[a] = sc.nextInt();
            a++;
        }
        
        Arrays.sort(data);
        
        for(int i = 0;i<N-2;i++){
            for(int j = i+1;j<N-1;j++){
                int low = 0;
                int high = N;
                int middle = 0;
                
                while(high-low>1){
                    
                    middle =(high+low)/2;
                    
                    
                    if(data[middle]<data[i]+data[j]){
                        low = middle;
                        
                    }else{
                        high = middle;
                    }
                }
                total=total+high-1-j;
            }
            
            
        }
        System.out.println(total);
    }
}
