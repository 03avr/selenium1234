package javasample;

public class Sumofeachdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=123;
int res=0;
while(n>0)
{
	int r=n%10;
	res=res+r;
	n=n/10;
}
System.out.println(res);
	}

}
