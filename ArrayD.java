
public class ArrayD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] x= {10,4,1,6,2};
      int [] y= new int[5];
      int sum=1;
      for(int i=0;i<x.length;i++)
      {
    	  sum=sum*x[i];
    	 
    	  
      }
      System.out.println(+sum);
      for(int i=0;i< x.length;i++)
      {
    	 y[i]=sum/x[i];
    	// System.out.print(" "+y[i]); 
      }
      for(int j=0;j< y.length;j++)
      {
    	 System.out.print(" "+y[j]);
    	  
      }

}
}