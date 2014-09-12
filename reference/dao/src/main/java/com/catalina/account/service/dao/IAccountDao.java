package com.catalina.account.service.dao;

import com.catalina.account.Account;

public interface IAccountDao {

	Account getAccountById(int acctId);

	Account getClientAccount(int clientId);

}
