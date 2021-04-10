import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int n1copy=n1;
        int n2copy=n2;
        
        while(n1%n2!=0){
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd = n2;
        int lcm = n1copy * n2copy / gcd;
        
        System.out.println(gcd);
        System.out.println(lcm);
     }
    }