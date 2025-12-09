package io.github.whiteblanc.investor_play;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class InvestorPlayController {

    private final SearchService searchService;
    private final CryptoSimplePriceRepository cryptoRepo;

    public InvestorPlayController(SearchService searchService, CryptoSimplePriceRepository cryptoRepo) {
        this.searchService = searchService;
        this.cryptoRepo = cryptoRepo;
    }

    @GetMapping("/result")
    public CryptoSimplePricesResponse getCryptoSimplePrices(@RequestParam(value = "id", defaultValue = "1,1027") String id, @RequestHeader(value = "x-api-key") String apiKey) {
        CryptoSimplePricesResponse response = searchService.getCryptoSimplePrices(id, apiKey);

        storeInDatabase(response.data().values());
        return response;
    }

    private void storeInDatabase(Collection<CryptoSimplePriceDto> values) {
        Collection<CryptoSimplePrice> cryptoSimplePrices = values.stream()
                .map(dto -> new CryptoSimplePrice(null, dto.id(), dto.symbol(), dto.price(), dto.last_updated()))
                .toList();
        cryptoRepo.saveAll(cryptoSimplePrices);
    }
}
