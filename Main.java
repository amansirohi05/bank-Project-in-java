package com;
import java.util.List;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		String ans="";
			
		int choice;
		int ID;
		int m;
		Scanner sc=new Scanner(System.in);
		List<Account> accs=AccountRepository.GenerateAccs();
		do{
			System.out.println("Enter Acc no.");
			int num=sc.nextInt();
			for(Account ac: accs){
				if(ac.getAccNo()==(num)){
					System.out.println(ac.getBalance());
					AccountRepository.accwithDraw(ac);	
				}
			}System.out.println("Continue with ADMIN VIEW(Y/N)");
			ans=sc.next();
		}while(ans.equals("y"));
	}
}