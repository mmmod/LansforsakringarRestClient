package lansforsakringar.api.services.internal;

import lansforsakringar.api.beans.Account;
import lansforsakringar.api.beans.TransactionsRequest;
import lansforsakringar.api.beans.TransactionsResponse;
import lansforsakringar.api.services.RestClient;

import org.springframework.web.client.RestTemplate;

public class ListTransactionsService {

	private final RestTemplate restTemplate;

	public ListTransactionsService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public TransactionsResponse getTransactions(Account account, Integer page) {
		TransactionsRequest request = new TransactionsRequest();
		request.setRequestedPage(page);
		request.setLedger(account.getLedger());
		request.setAccountNumber(account.getAccountNumber());

		TransactionsResponse response = restTemplate.postForObject(RestClient.LIST_TRANSACTIONS_URL, request,
				TransactionsResponse.class);
		return response;
	}

}
