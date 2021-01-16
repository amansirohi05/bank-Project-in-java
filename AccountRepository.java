package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountRepository
{
	static double bal;
	static double remaining;
	static Scanner s=new Scanner(System.in);
	public static int Accountno=0;
	static List<Account> acclist =new ArrayList<>();
	public static List<Account> GenerateAccs()
	{
		
		Accountno++;
		acclist.add(new Account(Accountno,390));
		Accountno++;
		acclist.add(new Account(Accountno,590));
		Accountno++;
		acclist.add(new Account(Accountno,490));

		return acclist;
	}
	public static List<Account> AddAccs(double accBalance)
	{
		Accountno++;
		System.out.println("Your Generated Account no is "+Accountno);
		bal=accBalance;
		acclist.add(new Account(Accountno,bal));
		return acclist;
	}
	public Account accDeposite(Account acc)
	{
		return null;
	}

	public static Account accwithDraw(Account acc)
	{
		System.out.println("Enter Balance to withdrawl");
		bal=s.nextInt();
		if(acc.getBalance()>=bal)
		{
			remaining=acc.getBalance()-bal;
			acc.setBalance(remaining);
			System.out.println("remaining balance is :"+ acc.getBalance());
		}
		else
		{
			System.out.println("balance is not Sufficient");
		}
		return acc;
	}

	public Account accBalance(Account acc)
	{
		return null;
	}
}