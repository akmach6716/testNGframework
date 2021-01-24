package training;

public class stringReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n= "Automation";
String reverse= "";
for(int i=n.length()-1;i>=0;i--)
{
	reverse= reverse+n.charAt(i);
}
System.out.println(reverse);
}
}
