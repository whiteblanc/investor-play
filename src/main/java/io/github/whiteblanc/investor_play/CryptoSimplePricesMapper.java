package io.github.whiteblanc.investor_play;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CryptoSimplePricesMapper {

    public CryptoSimplePricesResponse map(CoinMarketCapResponse src) {

        Map<String, CryptoSimplePriceDto> out = src.data().entrySet().stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> mapCrypto(e.getValue()),
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        return new CryptoSimplePricesResponse(src.status(), out);
    }

    private CryptoSimplePriceDto mapCrypto(Crypto crypto) {
        Map<String, Quote> quote = crypto.quote();
        Quote usd = quote.get("USD");
        Double price = usd.price();


        return new CryptoSimplePriceDto(crypto.id(), crypto.name(), crypto.symbol(), crypto.last_updated(), price);
    }
}
