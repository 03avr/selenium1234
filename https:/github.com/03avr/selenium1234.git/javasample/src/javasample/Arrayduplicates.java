package javasample;

public class Arrayduplicates {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int[]a= {10,45,12,12,10,45,2,6};
      for(int i=0;i<=a.length-1;i++)
      {
    	  int count=0;
    	  for(int j=0;j<=a.length-1;j++)
    	  {
    		  if(a[i]==a[j]&&i!=j)
    		  {
    			  count++;
    			  break;
    		  }
    	  }
    		  if( count==0)
    		  {
    			  System.out.println(a[i]);
    		  }
    	  }
      }
	}


