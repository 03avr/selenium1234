package javasample;

public class Duplicateonce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {10,20,10,20,3,4,3,5,6,7,7};
for(int i=0;i<=a.length-1;i++)
{
	int count=0;
	for(int j=i+1;j<=a.length-1;j++)
	{
		if(a[i]==a[j])
		{
		count++;
		break;
	}
	}
	if(count==0)
	{
		System.out.println(a[i]);
	}
}
	}

}
