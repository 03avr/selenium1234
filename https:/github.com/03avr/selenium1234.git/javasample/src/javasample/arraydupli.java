package javasample;

public class arraydupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,12,10,5,5,6,7,8};
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[i]!=a[j]&&i!=j)
				{
					//System.out.println(a[i]);
					count++;
					
					
				}
			
			if(count==0)
			{
				
			System.out.println(a[i]);
			}
		}
		}
	}
	}


