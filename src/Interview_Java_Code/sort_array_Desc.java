package Interview_Java_Code;

public class sort_array_Desc {

	
	public static void main(String[] args) {
		
		
		int a[]= {2,5,10,20,20,15,12};
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
	}
		
	
	
}
