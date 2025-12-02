package io.github.whiteblanc.investor_play;

import org.springframework.stereotype.Service;

@Service
public class SearchService {

    private final SearchClient searchClient;

    private final CryptoSimplePricesMapper mapper;
    public SearchService(SearchClient searchClient, CryptoSimplePricesMapper mapper) {
        this.searchClient = searchClient;
        this.mapper = mapper;
    }

    public CryptoSimplePricesResponse getCryptoSimplePrices(String id, String apiKey) {
        CoinMarketCapResponse coinMarketCapResponse = searchClient.getLatestQuotes(id, apiKey);
        CryptoSimplePricesResponse cryptoSimplePricesResponse = mapper.map(coinMarketCapResponse);
        return cryptoSimplePricesResponse;
    }

}
