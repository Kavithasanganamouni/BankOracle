package com.cg.bank.ui;
import java.util.Scanner;
import com.cg.bank.beans.CustomerDetails;
import com.cg.bank.service.IRegisterService;
import com.cg.bank.service.RegisterServiceImpl;
public class App {
	static Scanner sc=new Scanner(System.in);
	static CustomerDetails custobj=new CustomerDetails();
	
	public static CustomerDetails detailsForRegistration() throws Exception
	{
		
		IRegisterService serviceobj1=new RegisterServiceImpl();
		System.out.println("enter the customer first name");
		custobj.setFirstName(sc.next());
		System.out.println("enter the customer last name"); 
		custobj.setLastName(sc.next());
		System.out.println("enter the customer address");
		custobj.setAddress(sc.next());  
		System.out.println("enter the email id");
		custobj.setEmailId(sc.next());
		System.out.println("enter the password");
		custobj.setPassword(sc.nextInt());  
		System.out.println("enter the mobile number");
		custobj.setMobileNo(sc.nextLong());
		System.out.println("entet the aadhar Card number");
		custobj.setAadharNumber(sc.next());
		System.out.println("enter the pan card number");
		custobj.setPanCardNo(sc.next());
		
		CustomerDetails cust=serviceobj1. register ( custobj);
		
		return cust;
		}
	
	public static void methodForLogin()
	{System.out.println("enter the account number");
	    custobj.getAccountNumber();
	System.out.println("enter the password");
	custobj.getPassword();
	
	/*while(true)
	{int ch1=sc.nextInt();
		switch(ch1)
		{case 1:void deposit();
		       break;
		case 2:void withdraw();
		        break;
		  case 3: void showBalance();
		         break;
		  case 4: void transfer() ;
		         break;
		         default:System.exit(0);      		}
	}*/
	}
	public static void methodForSelect() throws Exception
	{ System.out.println("1)Register \n 2)Login \n 3)exit");
		while(true)
		{int ch=sc.nextInt();
			switch(ch)
			{case 1:detailsForRegistration();
			       break;
			case 2:methodForLogin();
			        break;
			   default:System.exit(0);     
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		 methodForSelect();
	

	}

}
