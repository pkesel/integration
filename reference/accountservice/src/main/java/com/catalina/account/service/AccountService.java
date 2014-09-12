package com.catalina.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.catalina.account.Account;
import com.catalina.account.Client;
import com.catalina.account.Contract;
import com.catalina.account.service.dao.IAccountDao;
import com.catalina.account.service.dao.IClientDao;

public class AccountService implements IAccountService {

	@Autowired
	private IAccountDao acctDao;

	@Autowired
	private IClientDao clientDao;

	@Override
	public Account getAccountById(int acctId) {
		return acctDao.getAccountById(acctId);
	}

	@Override
	public Client getClientById(int clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contract> getAccountContracts(int acctId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contract> getClientContracts(int clientId) {
		// TODO Auto-generated method stub
		return null;
	}

}
