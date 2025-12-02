package io.github.whiteblanc.investor_play;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class SearchClient {

    private final RestClient restClient;

    public SearchClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public CoinMarketCapResponse getLatestQuotes(String id, String apiKey) {
        CoinMarketCapResponse response = restClient.get()
                .uri("/v2/cryptocurrency/quotes/latest?id={id}", id)
                .header("X-CMC_PRO_API_KEY", apiKey)
                .accept(APPLICATION_JSON)
                .retrieve()
                .body(CoinMarketCapResponse.class);

        return response;
    }

}
