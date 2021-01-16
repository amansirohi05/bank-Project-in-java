package com;
import java.util.*;
public class Link
{
	int CustomerID;
	int CustomerID1;
	int AccountNO;
	int CustomerID2;
	link(int AccountNO,int CustomerID1,int CustomerID2)
	{
		this.AccountNO=AccountNO;
		this.CustomerID1=CustomerID1;
		this.CustomerID2=CustomerID2;
	}
	link(int AccountNO,int CustomerID)
	{
		this.AccountNO=AccountNO;
		this.CustomerID1=CustomerID;
	}
	public int getCustomerID()
	{
		return CustomerID;
	}
	public int getAccountNO()
	{
		return int AccountNO;
	}
}