package javasample;

public class Amstrongcube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=154;
int res=0;
int temp=n;
while(n>0)
{
	int r=n%10;
	res=res+r*r*r;
	n=n/10;
	
}
if(temp==res)
{
	System.out.println("amstrong number");
}
else
{
	System.out.println("not an amstrong number");
}
	}

}
