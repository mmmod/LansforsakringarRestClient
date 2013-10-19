package lansforsakringar.api.services.internal;

import lansforsakringar.api.beans.AccountType;
import lansforsakringar.api.beans.AccountList;
import lansforsakringar.api.services.RestClient;
import lansforsakringar.api.services.internal.transfer.AccountsRequest;

import org.springframework.web.client.RestTemplate;

public class ListAccountService {

	private final RestTemplate restTemplate;

	
	public ListAccountService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		
	}

	public AccountList getAccounts(AccountType accountType) {
		AccountsRequest request = new AccountsRequest();
		request.setAccountType(accountType.toString());
		AccountList accountsResponse = restTemplate.postForObject(RestClient.LIST_ACCOUNTS_URL, request, AccountList.class);
		return accountsResponse;
	}

}
