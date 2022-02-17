import java.util.*;

public class three{

    public static int bigfact(int n){
        int bf=0,i,j,prime,pf=0;
        for(i=2;i<=n;i++){
            prime=1;
            if(n%i==0){
                for(j=2;j<i;j++){
                    if(i%j==0)
                    prime=0;
                }
                if(prime==1){
                    pf=i;
                }
                if(pf>bf)
                bf=pf;
            }
        }
        
        return bf;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t,i=0;
        t=in.nextInt();
        int b[]={0};
        int biggies[] = Arrays.copyOf(b, t); 
        while(i<t){
            int n,pf;
            n=in.nextInt();
            pf=bigfact(n);
            biggies[i]=pf;
            i+=1;
        }
        for (int o: biggies){
            System.out.println(o);
        }        
    }
}