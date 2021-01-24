package training;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringWithDuplicates = "indepndent";
		char[] characters = stringWithDuplicates.toCharArray();
		Set set=new HashSet();
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates : " + stringWithDuplicates);
		for (char c : characters) {
			if (!set.contains(c)) {
			    set.add(c);
			    sb.append(c);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());
	    }
			}



