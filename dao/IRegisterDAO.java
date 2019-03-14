package com.cg.bank.dao;

import com.cg.bank.beans.CustomerDetails;

public interface IRegisterDAO {
	CustomerDetails register (CustomerDetails custobj) throws Exception;
	public void login();
}
