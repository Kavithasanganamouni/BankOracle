package com.cg.bank.service;

import com.cg.bank.beans.CustomerDetails;

public interface IRegisterService {
	CustomerDetails register (CustomerDetails custobj) throws Exception;
	public void login();
	

}
