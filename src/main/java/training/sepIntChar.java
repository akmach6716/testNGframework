package training;

public class sepIntChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="abc123";
		String Intstring=""; 
		String charstring="";
for(int i=0;i<S1.length();i++)
{
	if(Character.isDigit(S1.charAt(i)))
	{
		charstring=charstring+S1.charAt(i);
	}else
	{
		Intstring=Intstring+S1.charAt(i);
	}
	
	}
System.out.println(Intstring);
System.out.println(charstring);

	}
  
}
