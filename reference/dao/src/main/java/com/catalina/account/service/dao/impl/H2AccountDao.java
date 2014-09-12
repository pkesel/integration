package com.catalina.account.service.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.catalina.account.Account;
import com.catalina.account.Client;
import com.catalina.account.service.dao.IAccountDao;

@Repository("accountDao")
public class H2AccountDao implements IAccountDao {

	@Autowired
	private DataSource dataSource;

	public H2AccountDao() {

	}

	@Override
	public Account getAccountById(int acctId) {
		Account a = createMockAccount(acctId);
		return a;
	}

	@Override
	public Account getClientAccount(int clientId) {
		Account a = createMockAccount(clientId);
		return a;
	}

	private Account createMockAccount(int acctId) {
		Account a = new Account();
		a.setId(acctId);
		Client c = new Client();
		c.setId(acctId);
		a.setClient(c);
		return a;
	}
}
