package training;

public class combineStringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1="abc";
String S2="123";
String combine="";
for(int i=0;i< S1.length() || i< S2.length();i++)
{
	if(i<S1.length())
	{
		combine=combine+S1.charAt(i);
	}
	if(i<S2.length())
	{
		combine=combine+S2.charAt(i);
	}
	}
System.out.println(combine);
}


	}


