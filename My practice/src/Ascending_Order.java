
public class Ascending_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={5,7,1,4,2};
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print(" "+a[i]);
		}
		
	}

}
