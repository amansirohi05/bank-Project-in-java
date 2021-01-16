package com;
import java.util.*;
public class Account
{
	private int accNo;
	private double balance;
	Account(int acc,double bal)
	{
		super();
		accNo=acc;
		balance=bal;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
}