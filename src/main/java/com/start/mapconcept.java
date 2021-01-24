package com.start;

import java.util.HashMap;
import java.util.Map.Entry;

public class mapconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, employee> em= new HashMap<Integer, employee>();

employee e1= new employee(1, "dfsf", "Dev");
employee e2= new employee(2, "fgdfg", "Dev");
employee e3= new employee(3, "qwwrf", "QA");
employee e4= new employee(4, "qwwrcvf", "AQA");
em.put(1, e1);
em.put(2, e2);
em.put(3, e3);
em.put(4, e4);

for(Entry nr:em.entrySet())
{
	employee e= (employee) nr.getValue();
	System.out.println(nr.getKey()+" "+e.dept+" :"+e.sno+" :"+e.name);
	}

	}

}
