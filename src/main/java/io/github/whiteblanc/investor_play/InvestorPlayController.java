package io.github.whiteblanc.investor_play;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvestorPlayController {

    private final SearchService searchService;

    public InvestorPlayController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/result")
    public CryptoSimplePricesResponse getCryptoSimplePrices(@RequestParam(value = "id", defaultValue = "1,1027") String id, @RequestHeader(value = "x-api-key") String apiKey) {
            return searchService.getCryptoSimplePrices(id, apiKey);
}
}
