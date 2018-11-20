package first;

public class Ascnum {

	public static void main(String[] args) {
		
		int[] arr={20,40,39,10,50};
		
		int temp;
		
		//int[] arr=new int[5];
		
			
			int g=arr.length;
			System.out.println("length"+" "+g);
			
			for(int i=0;i<g;i++){
				
				for(int j=i+1;j<g;j++){
					
					
					if(arr[i]>arr[j]){
						 
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
						
						
					}
					
					
					
					
					
				}
				
				
			}
			
			for(int i=0;i<g;i++){
				
				System.out.print(arr[i]+",");
				
			}
			
			
	
		
	}

}
