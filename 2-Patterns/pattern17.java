import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        int spaces=n/2;
        int stars =1;
        
        for(int i=1; i<=n; i++){
            
            //spaces loop
            for(int j=1; j<=spaces; j++){
             System.out.print("	");
            }
            
            //stars loop
            for(int j=1; j<=stars; j++){
                if((i>1 && i< n/2+1) || (i> n/2+1 && i<n)){
                    if(j<=stars/2){
                        System.out.print("	");
                    }else{
                        System.out.print("*	");
                    }
                }else{
                    System.out.print("*	");
                }
            }
            
            //condition
            if(i<=n/2){
                spaces--;
                stars +=2;
            }else{
                spaces++;
                stars -=2;
            }
            System.out.println();
        }
    }
}