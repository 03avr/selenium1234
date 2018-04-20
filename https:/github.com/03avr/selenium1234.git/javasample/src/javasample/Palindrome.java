package javasample;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=123;
int temp=n;
int res=0;
while(n>0)
{
	int r=n%10;
	res=res+r*10;
	n=n/10;
	
}
if(temp==res)
{
	System.out.println("palindrome");
	
}
else
{
	System.out.println("not palindome");
}
	}

}
