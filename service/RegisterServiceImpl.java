package com.cg.bank.service;

import com.cg.bank.beans.CustomerDetails;
import com.cg.bank.dao.IRegisterDAO;
import com.cg.bank.dao.RegisterDAOImpl;

public class RegisterServiceImpl implements IRegisterService {
IRegisterDAO daoobj1=new RegisterDAOImpl();
	public CustomerDetails register(CustomerDetails custobj) throws Exception {
		CustomerDetails cust=daoobj1. register ( custobj);
		
		return cust;
	}

	public void login() {
		
		
		
	}

}
