package lansforsakringar.api.services.internal;

import lansforsakringar.api.beans.Account;
import lansforsakringar.api.beans.TransactionList;
import lansforsakringar.api.services.RestClient;
import lansforsakringar.api.services.internal.transfer.TransactionsRequest;

import org.springframework.web.client.RestTemplate;

public class ListTransactionsService {

	private final RestTemplate restTemplate;

	public ListTransactionsService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public TransactionList getTransactions(Account account, Integer page) {
		TransactionsRequest request = new TransactionsRequest();
		request.setRequestedPage(page);
		request.setLedger(account.getLedger());
		request.setAccountNumber(account.getAccountNumber());

		TransactionList response = restTemplate.postForObject(RestClient.LIST_TRANSACTIONS_URL, request,
				TransactionList.class);
		return response;
	}

}
