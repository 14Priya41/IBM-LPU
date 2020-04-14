package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Account;
import com.example.bean.AccountType;
import com.example.service.AccountService;
import com.example.service.AccountServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	AccountService service=context.getBean("accountServiceImpl",AccountServiceImpl.class);
		Account account=context.getBean("account",Account.class);
		
		
		  String str[]=UUID.randomUUID().toString().split("-");
		 account.setAccountNumber(str[0]);
		  account.setAccountType(AccountType.SAVINGS);
		  account.setInitialBalance(100000); 
		  account =service.createAccount(account);
		 
		  
	
		account.setInitialBalance(600000);
		  
		  account.setAccountNumber("761c7f3d");
		  account.setAccountType(AccountType.CURRENT);
		  
		  account=service.createAccount(account);
		  
		  //account=service.deleteAccount(account);
		 			
		System.out.println(account);
		 
		
		  List<Account> list=service.getAllAccountDetails(); 
		  Iterator<Account>i=list.iterator();
		  while(i.hasNext())
		  { Account account2=i.next();
		  System.out.println(account2);
		   }
		 
		//account=service.findByAccountNumber("761c7f3d");
		//service.deleteAccount("761c7f3d");
		//System.out.println(account);
		//service.updateAccount("761c16ggdhh", "CURRENT",100000);
		
		
    }
}
