package lansforsakringar.api.services;

import lansforsakringar.api.beans.AccountType;
import lansforsakringar.api.beans.AccountsResponse;
import lansforsakringar.api.beans.TransactionsResponse;

import org.fest.assertions.Assertions;
import org.junit.Assume;
import org.junit.Test;

/**
 * Example usage of the RestClient.
 * 
 * To use this test, add the following VM arguments:
 * 
 * <pre>
 * -DCUSTOMERID=SSID -DPINCODE=PIN
 * </pre>
 * 
 * SSID is your Swedish social security number
 * 
 * PINCODE is a four digit pin code for your Lansforsakringar Internet bank account.
 */
public class RestClientIntegrationTest {

	@Test
	public void shouldLoginAndFetchTransactions() throws Exception {
		// Shake hands and login
		RestClient client = RestClient.createAuthenticatedClient(findProperty("CUSTOMERID"), findProperty("PINCODE"));

		// List my SAVINGS accounts
		AccountsResponse accounts = client.getAccounts(AccountType.SAVING);

		// Fetch first page of transactions (20 of 'em) from the first of my accounts
		TransactionsResponse transactions = client.getTransactions(accounts.getAccounts().get(0), 0);
		Assertions.assertThat(transactions.getTransactions()).hasSize(20);
	}

	private String findProperty(String id) {
		String property = System.getProperty(id);
		Assume.assumeNotNull(property);
		return property;
	}

}
