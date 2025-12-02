package io.github.whiteblanc.investor_play;

import java.util.Map;

public record CryptoSimplePricesResponse(Status status, Map<String, CryptoSimplePrice> data) {
}
