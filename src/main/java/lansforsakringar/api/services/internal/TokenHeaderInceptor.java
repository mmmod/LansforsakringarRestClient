package lansforsakringar.api.services.internal;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;

public class TokenHeaderInceptor implements ClientHttpRequestInterceptor {
	
	private final String ctoken;
	private final String utoken;

	public TokenHeaderInceptor(String ctoken, String utoken) {
		this.ctoken = ctoken;
		this.utoken = utoken;
	}

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body,
			ClientHttpRequestExecution execution) throws IOException {
	    HttpRequestWrapper requestWrapper = new HttpRequestWrapper(request);
	    requestWrapper.getHeaders().add("ctoken", ctoken);
	    requestWrapper.getHeaders().add("utoken", utoken);
		requestWrapper.getHeaders().add("DeviceId", "f8280cf34708c7b5a8bd2ed93dcd3c8148d00000");
		return execution.execute(requestWrapper, body);
	}

}
