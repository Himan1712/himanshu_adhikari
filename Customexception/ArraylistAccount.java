package Customexception;

import java.util.*;

public class ArraylistAccount {

	public static void main(String[] args) {
        List<Account> list = new ArrayList<Account>();
		
		Account ac = new Account("Himanshu", 10011, 34000);
		Account ac1  = new Account("hardik", 10022, 35000);
		Account ac2  = new Account("hardik", 10022, 35000);
		list.add(ac);
		list.add(ac1);
		list.add(new Account("mukul",10033,50000));
		list.add(new Account("Virat", 10044, 34500));
		list.add(ac1);
		list.add(new Account("Pankaj",10033,50000));
		
		boolean isPresent = list.contains(ac1);
		System.out.println("hardik has already created the account: "+isPresent);
		
		 boolean res =  ac1.equals(ac2);
		 System.out.println("a1 object and a2 both are represent single customer: "+res);
		
	}

	}

