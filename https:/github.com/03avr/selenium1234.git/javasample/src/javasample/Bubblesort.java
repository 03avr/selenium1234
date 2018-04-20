package javasample;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {100,90,80,10};
int n=a.length-2;
for(int x=0;x<=n;x++)
{
for(int i=0;i<=n;i++)
{
	if(a[i]>a[i+1])
	{
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	}
}
}
for(int k:a)
{
	System.out.println(k);
}
	}
	}

