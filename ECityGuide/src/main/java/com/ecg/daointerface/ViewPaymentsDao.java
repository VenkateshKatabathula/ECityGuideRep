package com.ecg.daointerface;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ViewPaymentsDao {

	public abstract ResultSet viewPayments() throws ClassNotFoundException, SQLException;
	public abstract ResultSet viewPayments1() throws ClassNotFoundException, SQLException;

}
