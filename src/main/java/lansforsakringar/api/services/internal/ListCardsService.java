package lansforsakringar.api.services.internal;

import lansforsakringar.api.beans.CardList;
import lansforsakringar.api.services.RestClient;

import org.springframework.web.client.RestTemplate;

public class ListCardsService {

	private final RestTemplate restTemplate;

	public ListCardsService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public CardList getCards() {
		return restTemplate.getForObject(RestClient.LIST_CARDS_URL, CardList.class);
	}

}
