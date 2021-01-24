package com.start;
class emp
{int eid;
 int salary;
 String ceo;
 public void show()
 {
	 System.out.println(eid+": "+salary+": "+ceo+": ");
 }
	}

public class staticDemo {
	
	public static void main(String[] args) 
	{  emp navin= new emp();
	   emp rahul= new emp();
	   navin.eid=8;
	   navin.salary=4000;
	   navin.ceo="Mahesh";
	   rahul.eid=9;
	   rahul.salary=8000;
	   rahul.ceo="Mahesh";
	   navin.show();
	   rahul.show();
	 
	}

}
