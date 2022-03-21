
public class Main {

	
	public static   void main(String[] args) {
		
		
		int a[] ={9,3,1,6,7,2,11};
		int temp=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print(" " +a[i]);
		}
		
	}
	
}
