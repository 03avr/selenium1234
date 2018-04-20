package javasample;

public class Stringremodupli {
	public static void main(String args[])
	{
String s="java";
String s2="";

for(int i=0;i<=s.length()-1;i++)
{
	int count=0;
	for(int j=0;j<=s2.length()-1;j++)
	{
		if(s.charAt(i)==s2.charAt(j))
		{
			count++;
			break;
		}
	}

	if(count==0)
	{
		s2+=s.charAt(i);
	}
}
	System.out.print(s2);
}
}

