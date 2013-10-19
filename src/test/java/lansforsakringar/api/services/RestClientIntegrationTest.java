package lansforsakringar.api.services;

import lansforsakringar.api.beans.AccountType;
import lansforsakringar.api.beans.AccountsResponse;
import lansforsakringar.api.beans.TransactionsResponse;

import org.fest.assertions.Assertions;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class RestClientIntegrationTest {

	private String customerId;
	private String pinCode;

	@Before
	public void setupCustomerIdAndPincode() throws Exception {
		customerId = findProperty("CUSTOMERID");
		pinCode = findProperty("PINCODE");
	}

	private String findProperty(String id) {
		String property = System.getProperty(id);
		Assume.assumeNotNull(property);
		return property;
	}

	@Test
	public void shouldLoginAndFetchTransactions() throws Exception {
		// Shake hands and login
		RestClient client = RestClient.createAuthenticatedClient(customerId, pinCode);
		
		// List my SAVINGS accounts
		AccountsResponse accounts = client.getAccounts(AccountType.SAVING);
		
		// Fetch first page of transactions (20 of 'em) from the first of my accounts
		TransactionsResponse transactions = client.getTransactions(accounts.getAccounts().get(0), 0);
		Assertions.assertThat(transactions.getTransactions()).hasSize(20);
	}

}
