import java.util.Scanner;

public class elephant{
    static int getx(){                     // used to Get Elephant's Friend location point Input
        Scanner ways=new Scanner(System.in);
        System.out.print("Enter Elephant's friend Location point: ");
        return (ways.nextInt());
        
    }
    public static void main(String[] args) {
        int x,n1,n2,n3,n4,n5;              // x is the Location point , ny is used to store No. of y ways
        x=getx();
        while( x<1 || x>1000000)
        {          // Making sure the location x in between 1 & 1 000 000 
        System.out.println("Invalid Location");
        x=getx();
        }

        n5=x/5;                            // getting possible y(5) position forward steps
        x%=5;                              // Eliminating y(5) position forward steps from distance

        n4=x/4;
        x%=4;

        n3=x/3;
        x%=3;

        n2=x/2;
        x%=2;

        n1=x;

        System.out.println("Min No.of steps Required:"+(n1+n2+n3+n4+n5));    //printing the sum of minimum y steps Required
    }
}
