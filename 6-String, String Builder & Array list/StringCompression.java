import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
	    String ans ="";
	    
	    for(int i=0; i<str.length()-1; i++){
	        if(str.charAt(i) != str.charAt(i+1)){
	            ans += str.charAt(i);
	        }else{
	            //skip
	        }
	    }
	    ans += str.charAt(str.length()-1);
	    return ans;
	}

	public static String compression2(String str){
	    String ans="";
	    int i=0;
	    while(i<str.length()){
	        int count=0;
	        char ch=str.charAt(i);
	        while(i<str.length() && str.charAt(i)==ch){
	            i++;
	            count++;
	        }
	        ans += ch;
	        if(count>1)ans += count;
	    }
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}