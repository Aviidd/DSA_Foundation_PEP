import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        int spaces=1;
        int stars= n/2+1;
        
        for(int i=1; i<=n; i++){
            //starloop
            for(int j=1; j<=stars; j++){
                System.out.print("*	");
            }
            
            //spaceloop
            for(int j=1; j<=spaces; j++){
                System.out.print("	");
            }
            
            //starloop
            for(int j=1; j<=stars; j++){
                System.out.print("*	");
            }
            
            //condition
            if(i<=n/2){
                spaces +=2;
                stars--;
            }
            else{
                spaces -=2;
                stars++;
            }
            
            System.out.println();
        }
        

    }
}