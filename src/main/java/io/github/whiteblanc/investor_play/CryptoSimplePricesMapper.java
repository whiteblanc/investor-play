package io.github.whiteblanc.investor_play;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CryptoSimplePricesMapper {

    public CryptoSimplePricesResponse map(CoinMarketCapResponse src) {

        Map<String, CryptoSimplePrice> out = src.data().entrySet().stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> mapCrypto(e.getValue()),
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        return new CryptoSimplePricesResponse(src.status(), out);
    }

    private CryptoSimplePrice mapCrypto(Crypto crypto) {
        Map<String, Quote> quote = crypto.quote();
        Quote usd = quote.get("USD");
        Double price = usd.price();


        return new CryptoSimplePrice(crypto.id(), crypto.name(), crypto.symbol(), price);
    }
}
