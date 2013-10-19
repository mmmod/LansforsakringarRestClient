package lansforsakringar.api.services.internal;

import lansforsakringar.api.beans.AccountType;
import lansforsakringar.api.beans.AccountsRequest;
import lansforsakringar.api.beans.AccountsResponse;
import lansforsakringar.api.services.RestClient;

import org.springframework.web.client.RestTemplate;

public class ListAccountService {

	private final RestTemplate restTemplate;

	
	public ListAccountService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		
	}

	public AccountsResponse getAccounts(AccountType accountType) {
		AccountsRequest request = new AccountsRequest();
		request.setAccountType(accountType.toString());
		AccountsResponse accountsResponse = restTemplate.postForObject(RestClient.LIST_ACCOUNTS_URL, request, AccountsResponse.class);
		return accountsResponse;
	}

}
