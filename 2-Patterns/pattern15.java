import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int spaces=n/2;
        int stars=1;
        int count=1;
        for(int i=1; i<=n; i++){
            //space loop
            for(int j=1; j<=spaces; j++){
                System.out.print("	");
            }
            
            //star loop
            int countcopy=count;
            for(int j=1; j<=stars; j++){
                System.out.print(countcopy +"	");
                if(j<=stars/2){
                    countcopy++;
                }
                else{
                    countcopy--;
                }
            }
            
            if(i<=n/2){
                spaces--;
                stars +=2;
                count++;
            }
            else{
                spaces++;
                stars -=2;
                count--;
            }
            System.out.println();
        }

    }
}