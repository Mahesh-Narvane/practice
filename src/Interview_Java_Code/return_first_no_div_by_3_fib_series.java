package Interview_Java_Code;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class return_first_no_div_by_3_fib_series {

		
	public static void main(String[] args) {
		
		
	String s ="cat dog cat tiger rat cat god";
	String[] sp = s.split(" ");
	int count=0;
	
	     for (int i = 0; i <s.length()-1; i++) {
	
	    	 String word=sp[i];
	    	 for (int j = 0; j <word.length(); j++) {
				
	    		 if(sp[i]==sp[j]) 
	    		 {
	    			 count++;
	    		 }
			}
	    	 System.out.println(count+" "+sp[i]);
	    	
		}
	    
	
	
	}	
		
	}
	

