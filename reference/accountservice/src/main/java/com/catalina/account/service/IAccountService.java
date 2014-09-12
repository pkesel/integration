package com.catalina.account.service;

import java.util.List;

import com.catalina.account.Account;
import com.catalina.account.Client;
import com.catalina.account.Contract;

public interface IAccountService {

	Account getAccountById(int acctId);

	Client getClientById(int clientId);

	List<Contract> getAccountContracts(int acctId);

	List<Contract> getClientContracts(int clientId);

}
