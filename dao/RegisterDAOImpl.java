package com.cg.bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.cg.bank.beans.CustomerDetails;
import com.cg.bank.utility.Database;
public class RegisterDAOImpl implements IRegisterDAO {
      public CustomerDetails register(CustomerDetails custobj) throws Exception {
		Database db=new Database();
		Connection connection=db.myConnection();
		PreparedStatement ps=connection.prepareStatement("insert into customer_details3 values('customer_seq1.nextval',?,?,?,?,?,?,?,?)");
		CustomerDetails cust=new CustomerDetails();
		ps.setString(4,cust.getAddress());
		ps.setString(2,cust.getFirstName());
		ps.setString(3,cust.getLastName());
		ps.setString(5,cust.getEmailId());
		ps.setInt(6,cust.getPassword());
		ps.setLong(7,cust.getMobileNo());
		ps.setString(8,cust.getAadharNumber());
		ps.setString(9,cust.getPanCardNo());
	   
	     int i=ps.executeUpdate();
		return cust;
	}

	
	

	public void login() {
		// TODO Auto-generated method stub
		
	}

}
