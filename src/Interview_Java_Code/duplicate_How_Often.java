package Interview_Java_Code;

public class duplicate_How_Often {

	
	public static void main(String[] args) {
		
		
		String s = "Welcome to moolya";
	      char[]ch=s.toCharArray();
			
	      for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j] ) 
				{
					System.out.print(ch[i]);
					break;
				}
			}
		}
		
		
	}
	
}
