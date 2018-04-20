 package javasample;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="anju is in ";
String res="";
for(int i=s.length()-1;i>=0;--i)
{
	res+=s.charAt(i);
}
System.out.println(res);
	}

}
