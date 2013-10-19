package lansforsakringar.api.services;

import java.net.URI;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import lansforsakringar.api.beans.Account;
import lansforsakringar.api.beans.AccountType;
import lansforsakringar.api.beans.AccountsResponse;
import lansforsakringar.api.beans.Ticket;
import lansforsakringar.api.beans.TransactionsResponse;
import lansforsakringar.api.services.internal.ListAccountService;
import lansforsakringar.api.services.internal.ListTransactionsService;
import lansforsakringar.api.services.internal.LoginService;
import lansforsakringar.api.services.internal.TokenHeaderInceptor;

import org.apache.commons.codec.DecoderException;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	public static final String BASE_URL = "https://mobil.lansforsakringar.se/appoutlet";
	public static final String TOKEN_CHALLENGE_URL = BASE_URL + "/security/client";
	public static final String AUTHENTICATE_URL = BASE_URL + "/security/user";
	public static final String LIST_ACCOUNTS_URL = BASE_URL + "/account/bytype";
	public static final String LIST_TRANSACTIONS_URL = BASE_URL + "/account/transaction";
	
	
	private final RestTemplate restTemplate;

	private RestClient() {
		this.restTemplate = new RestTemplate();
	}
	
	private RestClient(RestTemplate restTemplate, Ticket ticket) {
		this.restTemplate = restTemplate;
		this.restTemplate.setInterceptors(setupInterceptors(ticket));
	}
	
	private List<ClientHttpRequestInterceptor> setupInterceptors(Ticket ticket) {
		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
		interceptors.add(new TokenHeaderInceptor(ticket.getCtoken(), ticket.getUtoken()));
		return interceptors;
	}

	public static RestClient createAuthenticatedClient(String customerId, String pinCode) throws NoSuchAlgorithmException, DecoderException {
		RestClient client = new RestClient();
		Ticket ticket = client.login(customerId, pinCode);
		return new RestClient(client.restTemplate, ticket);
	}

	private Ticket login(String customerId, String pinCode) throws NoSuchAlgorithmException, DecoderException {
		Ticket ticket = new LoginService(restTemplate).login(customerId, pinCode);
		return ticket;
	}

	public AccountsResponse getAccounts(AccountType accountType) {
		return new ListAccountService(restTemplate).getAccounts(accountType);
	}

	public TransactionsResponse getTransactions(Account account, Integer page) {
		return new ListTransactionsService(restTemplate).getTransactions(account, page);
	}

}
