package javasample;

public class Arraycompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {10,20,30};
int[]b= {10,20,40};
for(int i=0;i<=a.length-1;i++)
{
	for(int j=0;j<=b.length-1;j++)
	{
		if(a[i]==b[j])
		{
			System.out.println("array elemnts are same");
		}
	
	else
	{
System.out.println("not same");		
	}
}
	}

}
}