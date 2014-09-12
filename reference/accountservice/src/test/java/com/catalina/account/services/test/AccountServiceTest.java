package com.catalina.account.services.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.catalina.account.service.dao.IAccountDao;

@ContextConfiguration(locations = { "classpath:accountTest-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountServiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	private static final Log LOGGER = LogFactory
			.getLog(AccountServiceTest.class);

	@Autowired
	private IAccountDao peopleDAO;

	@Test
	public void testContext() {
		assertNotNull(peopleDAO);
	}

	@Test
	public void testGetAccountById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClientById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountContracts() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClientContracts() {
		fail("Not yet implemented");
	}
}
