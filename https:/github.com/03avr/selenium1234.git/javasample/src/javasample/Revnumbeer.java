package javasample;

public class Revnumbeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=452;
int res=0;
while(n>0)
{
	int r=n%10;
	res=res*10+r;
	n=n/10;
}
System.out.println(res);
	}

}
