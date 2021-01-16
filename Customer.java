package com;
import java.util.*;
public class Customer
{
	private String First_name;
	private String Last_name;
	private int Customer_Id;
	private String Address;
	private String Phone_NO;	
	Customer(int Cust_Id,String F_name,String L_name,String Add,String phn)
	{
		super();
		Customer_Id=Cust_Id;
		First_name=F_name;
		Last_name=L_name;
		Address=Add;
		Phone_NO=phn;
	}
	public String getFirst_name()
	{
		return First_name;
	}
	public String getLast_name()
	{
		return Last_name;
	}
	public int getCustomer_Id()
	{
		return Customer_Id;
	}
	public String getAddress()
	{
		return Address;
	}
	public String getPhone_NO()
	{
		return Phone_NO;
	}
	public void setFirst_name(String First_name)
	{
		this.First_name=First_name;
	}
	public void setLast_name(String Last_name)
	{
		this.Last_name=Last_name;
	}
	public void setCustomer_Id(int Customer_Id)
	{
		this.Customer_Id=Customer_Id;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public void setPhone_NO(String Phone_NO)
	{
		this.Phone_NO=Phone_NO;
	}
}