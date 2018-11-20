package first;

public class CrrectPrime {

	public static void main(String[] args) {
		
		String primeNumbers="";
		
		for (int i=3;i<=10;i++){
			
			int flag=0;
		
		for(int n=i;n>=1;n--){
			
			
			if(i%n==0){
				
				
				flag=flag+1;
					
			}
		}
		if (flag==2)
			primeNumbers = primeNumbers + i + " ";
			


}
		System.out.println(primeNumbers);

	}
}