package com.start;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rem,sum=0,temp;    
		  int n=121;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   rem=n%10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}

}
