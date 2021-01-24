package training;

public class splitandreplace {

	public static void main(String[] args) {
	
		String S1="Altus Analytics";
		String [] arr=S1.split(" ");
	     System.out.println((arr[0]+arr[1]).replace("Altus", "Argus"));

	}

}
