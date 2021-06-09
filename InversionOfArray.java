
public class InversionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 int [] x= {1,20,6,4,5};
		 int count=0;
		 for(int i=0;i<x.length;i++){
			 for(int j=i+1;j<x.length;j++) {
				 if(x[i]>x[j]) {
					 count++;
				 }
				 
				 
			 }
			
		 }
		 System.out.println("NUMBER OF INVERSION:"+count);
	}

}
