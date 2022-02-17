import java.util.*;

public class two{

    public static int summer(int n){
        int a=1,b=2,c=0,s=0;
        while (a<n) {
            if(a%2==0)
            s+=a;
            c=a+b;
            a=b;
            b=c;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t,i=0;
        t=in.nextInt();
        int b[]={0};
        int sums[] = Arrays.copyOf(b, t); 
        while(i<t){
            int n,sum;
            n=in.nextInt();
            sum=summer(n);
            sums[i]=sum;
            i+=1;
        }
        for (int o: sums){
            System.out.println(o);
        }        
    }
}