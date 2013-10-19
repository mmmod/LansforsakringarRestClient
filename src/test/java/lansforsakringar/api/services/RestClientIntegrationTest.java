package lansforsakringar.api.services;

import lansforsakringar.api.beans.AccountType;
import lansforsakringar.api.beans.AccountList;
import lansforsakringar.api.beans.CardList;
import lansforsakringar.api.beans.TransactionList;

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
		AccountList accounts = client.getAccounts(AccountType.SAVING);
		Assertions.assertThat(accounts.getAccounts()).isNotEmpty();

		// Fetch first page of transactions (20 of 'em) from the first of my accounts
		TransactionList transactions = client.getTransactions(accounts.getAccounts().get(0), 0);
		Assertions.assertThat(transactions.getTransactions()).hasSize(20);
		
		// List my DEBIT and CREDIT cards
		CardList cards = client.getCards();
		Assertions.assertThat(cards.getCards()).isNotEmpty();
	}

	private String findProperty(String id) {
		String property = System.getProperty(id);
		Assume.assumeNotNull(property);
		return property;
	}

}
