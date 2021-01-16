package com;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository
{
	public static int CustomerId=0;
	static List<Customer> cuslist =new ArrayList<>();
	public static List<Customer> GenerateCus()
	{
		
		CustomerId++;
		cuslist.add(new Customer(CustomerId,"Aman","Sirohi","Delhi","703768236"));
		CustomerId++;
		cuslist.add(new Customer(CustomerId,"Shivam","Sirohi","Mumbai","703065345"));
		CustomerId++;
		cuslist.add(new Customer(CustomerId,"Shubham","Kumar","Kolkata","908708236"));

		return cuslist;
	}
	public static List<Customer> AddCus(String Fname,String Lname,String Add,String Number)
	{
		CustomerId++;
		System.out.println("Your Generated CustomerId is "+CustomerId);
		String fn=Fname;
		String ln=Lname;
		String Ad=Add;
		String n=Number;
		cuslist.add(new Customer(CustomerId,fn,ln,Ad,n));
		return cuslist;
	}
	
}